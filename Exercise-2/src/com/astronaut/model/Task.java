package com.astronaut.model;

import java.time.LocalTime;

public class Task {
    private String description;
    private LocalTime start;
    private LocalTime end;
    private String priority;
    private boolean completed;

    public Task(String description, LocalTime start, LocalTime end, String priority) {
        this.description = description;
        this.start = start;
        this.end = end;
        this.priority = priority.toUpperCase();
        this.completed = false;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalTime getStart() { return start; }
    public void setStart(LocalTime start) { this.start = start; }

    public LocalTime getEnd() { return end; }
    public void setEnd(LocalTime end) { this.end = end; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority.toUpperCase(); }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        return start + " - " + end + ": " + description + " [" + priority + "]" + (completed ? " (Done)" : "");
    }
}
