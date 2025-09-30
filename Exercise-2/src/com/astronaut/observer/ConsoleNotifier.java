package com.astronaut.observer;

import com.astronaut.model.Task;

public class ConsoleNotifier implements ScheduleObserver {
    @Override
    public void onTaskAdded(Task task) {
        System.out.println("Task added: " + task);
    }

    @Override
    public void onTaskConflict(Task newTask, Task conflictTask) {
        System.out.println("Conflict: " + newTask.getDescription() +
                " overlaps with " + conflictTask.getDescription());
    }

    @Override
    public void onTaskRemoved(Task task) {
        System.out.println("Task removed: " + task.getDescription());
    }
}
