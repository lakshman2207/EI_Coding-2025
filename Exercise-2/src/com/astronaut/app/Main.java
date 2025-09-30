package com.astronaut.app;

import com.astronaut.controller.ScheduleController;
import com.astronaut.manager.ScheduleManager;
import com.astronaut.model.Task;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        setupLogger();

        ScheduleManager manager = ScheduleManager.getInstance();
        ScheduleController controller = new ScheduleController();

        Scanner sc = new Scanner(System.in);
        boolean exitRequested = false;

        do {
            System.out.println("\n--- Astronaut Schedule Organizer ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.println("5. Edit Task");
            System.out.println("6. Mark Task Completed");
            System.out.println("7. View Tasks by Priority");

            System.out.print("Choice: ");

            String choice = sc.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Start (HH:MM): ");
                        String s = sc.nextLine();
                        System.out.print("End (HH:MM): ");
                        String e = sc.nextLine();
                        System.out.print("Priority (LOW/MEDIUM/HIGH): ");
                        String p = sc.nextLine();

                        controller.addTask(desc, s, e, p);
                        System.out.println("Task added successfully. No conflicts.");
                        logger.info("Task added: " + desc);
                        break;

                    case "2":
                        System.out.print("Enter task to remove: ");
                        String toRemove = sc.nextLine();
                        controller.removeTask(toRemove);
                        System.out.println("Task removed successfully.");
                        logger.info("Task removed: " + toRemove);
                        break;

                    case "3":
                        List<Task> tasks = controller.viewAll();
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks scheduled for the day.");
                        } else {
                            tasks.forEach(t -> System.out.println(
                                    t.getStart() + " - " + t.getEnd() + ": " + t.getDescription()
                                            + " [" + t.getPriority() + "]" + (t.isCompleted() ? " (Done)" : "")));
                        }
                        logger.info("Viewed tasks list.");
                        break;

                    case "4":
                        exitRequested = true;
                        logger.info("Exit requested by user.");
                        break;
                    case "5":
                        System.out.print("Enter task to edit: ");
                        String oldDesc = sc.nextLine();
                        System.out.print("New Description: ");
                        String newDesc = sc.nextLine();
                        System.out.print("Start (HH:MM): ");
                        String start = sc.nextLine();
                        System.out.print("End (HH:MM): ");
                        String end = sc.nextLine();
                        System.out.print("Priority (LOW/MEDIUM/HIGH): ");
                        String priority = sc.nextLine();
                        controller.editTask(oldDesc, newDesc, start, end, priority);
                        System.out.println("Task edited successfully.");
                        logger.info("Task edited: " + oldDesc);
                        break;

                    case "6":
                        System.out.print("Enter task to mark as completed: ");
                        String completedDesc = sc.nextLine();
                        controller.markCompleted(completedDesc);
                        System.out.println("Task marked as completed.");
                        logger.info("Task completed: " + completedDesc);
                        break;

                    case "7":
                        System.out.print("Enter priority to filter (LOW/MEDIUM/HIGH): ");
                        String filterPriority = sc.nextLine();
                        List<Task> filtered = controller.viewByPriority(filterPriority);
                        if (filtered.isEmpty()) {
                            System.out.println("No tasks with priority " + filterPriority + ".");
                        } else {
                            filtered.forEach(System.out::println);
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        logger.warning("Invalid menu choice: " + choice);
                }
            } catch (Exception ex) {
                // Print only user-friendly message on console
                System.out.println("Error: " + ex.getMessage());
                // Log full exception to file only
                logger.log(Level.SEVERE, "Exception occurred: " + ex.getMessage(), ex);
            }
        } while (!exitRequested);

        sc.close();
    }

    private static void setupLogger() {
        try {
            LogManager.getLogManager().reset();
            logger.setLevel(Level.ALL);

            // Log file output (full exceptions go here)
            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            // Disable console handler so stack traces won't appear on console
            // Only user-friendly messages will be printed manually
            // If you want warnings/errors in console, you can add a handler here
            // ConsoleHandler consoleHandler = new ConsoleHandler();
            // consoleHandler.setLevel(Level.OFF);
            // logger.addHandler(consoleHandler);

        } catch (IOException e) {
            System.err.println("Failed to setup logger: " + e.getMessage());
        }
    }
}
