package com.astronaut.manager;

import com.astronaut.model.Task;
import com.astronaut.exception.TaskNotFoundException;
import com.astronaut.observer.ScheduleObserver;

import java.time.LocalTime;
import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private final List<Task> tasks = new ArrayList<>();
    private final List<ScheduleObserver> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) instance = new ScheduleManager();
        return instance;
    }

    public void addObserver(ScheduleObserver o) { observers.add(o); }

    public void addTask(Task task) {
        checkConflict(task);
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStart));
        observers.forEach(o -> o.onTaskAdded(task));
    }

    public void removeTask(String desc) {
        Task task = findTask(desc);
        tasks.remove(task);
        observers.forEach(o -> o.onTaskRemoved(task));
    }

    // Optional: edit task
    public void editTask(String oldDesc, String newDesc, String start, String end, String priority) {
        Task task = findTask(oldDesc);
        Task temp = new Task(newDesc, LocalTime.parse(start), LocalTime.parse(end), priority);
        tasks.remove(task);
        try {
            checkConflict(temp);
            task.setDescription(newDesc);
            task.setStart(LocalTime.parse(start));
            task.setEnd(LocalTime.parse(end));
            task.setPriority(priority);
            tasks.add(task);
            tasks.sort(Comparator.comparing(Task::getStart));
        } catch (IllegalArgumentException ex) {
            tasks.add(task); // rollback
            throw ex;
        }
    }

    // Optional: mark as completed
    public void markTaskCompleted(String desc) {
        Task task = findTask(desc);
        task.setCompleted(true);
    }

    public List<Task> getTasks() { return Collections.unmodifiableList(tasks); }

    private Task findTask(String desc) {
        return tasks.stream()
                .filter(t -> t.getDescription().equalsIgnoreCase(desc))
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException("Task not found: " + desc));
    }

    private void checkConflict(Task newTask) {
        for (Task t : tasks) {
            if (!(newTask.getEnd().isBefore(t.getStart()) || newTask.getStart().isAfter(t.getEnd()))) {
                observers.forEach(o -> o.onTaskConflict(newTask, t));
                throw new IllegalArgumentException(
                        "Task conflicts with existing task \"" + t.getDescription() + "\"."
                );
            }
        }
    }
}
