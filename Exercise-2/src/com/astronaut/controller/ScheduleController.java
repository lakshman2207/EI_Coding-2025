package com.astronaut.controller;

import com.astronaut.factory.TaskFactory;
import com.astronaut.manager.ScheduleManager;
import com.astronaut.model.Task;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class ScheduleController {
    private final ScheduleManager manager = ScheduleManager.getInstance();

    public void addTask(String desc, String start, String end, String priority) {
        Task task = TaskFactory.createTask(desc, start, end, priority);
        manager.addTask(task);
    }

    public void removeTask(String desc) {
        manager.removeTask(desc);
    }

    public List<Task> viewAll() {
        return manager.getTasks();
    }

    // Optional 1: Edit existing task
    public void editTask(String oldDesc, String newDesc, String start, String end, String priority) {
        manager.editTask(oldDesc, newDesc, start, end, priority);
    }

    // Optional 2: Mark task as completed
    public void markCompleted(String desc) {
        manager.markTaskCompleted(desc);
    }

    // Optional 3: View tasks by priority
    public List<Task> viewByPriority(String priority) {
        return manager.getTasks().stream()
                .filter(t -> t.getPriority().equalsIgnoreCase(priority))
                .collect(Collectors.toList());
    }
}
