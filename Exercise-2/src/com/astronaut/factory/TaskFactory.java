package com.astronaut.factory;

import com.astronaut.model.Task;
import com.astronaut.exception.InvalidTimeFormatException;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TaskFactory {

    // Factory method to create Task objects safely
    public static Task createTask(String description, String start, String end, String priority) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be empty.");
        }

        try {
            LocalTime startTime = LocalTime.parse(start);
            LocalTime endTime = LocalTime.parse(end);

            if (endTime.isBefore(startTime) || endTime.equals(startTime)) {
                throw new IllegalArgumentException("Task start time must be before end time.");
            }

            return new Task(description, startTime, endTime, priority);

        } catch (DateTimeParseException e) {
            throw new InvalidTimeFormatException("Invalid time format. Use HH:MM.");
        }
    }
}
