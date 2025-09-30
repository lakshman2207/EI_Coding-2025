package com.astronaut.observer;

import com.astronaut.model.Task;

public interface ScheduleObserver {
    void onTaskAdded(Task task);
    void onTaskConflict(Task newTask, Task conflictTask);
    void onTaskRemoved(Task task);
}
