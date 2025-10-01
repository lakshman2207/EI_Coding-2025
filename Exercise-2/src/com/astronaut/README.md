# Astronaut Task Scheduler

A robust Java application for managing and scheduling astronaut tasks, designed with a focus on clean architecture and maintainability. This project leverages multiple object-oriented design patterns to ensure scalability, flexibility, and ease of extension.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Design Patterns](#design-patterns)
- [Architecture](#architecture)
- [Folder Structure](#folder-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview
This application allows users to efficiently manage astronaut schedules and tasks, providing a modular and extensible codebase suitable for both educational and production use. The codebase demonstrates best practices in Java development, including exception handling, modularization, and the use of design patterns.

## Features
- Add, update, and remove astronaut tasks
- Schedule management with input validation
- Console notifications for schedule changes
- Extensible and modular codebase
- Clear separation of concerns

## Design Patterns
This project implements the following design patterns:

- **Factory Pattern:**
  - Used in `TaskFactory` to encapsulate the creation logic of different task types, promoting loose coupling and scalability.
- **Observer Pattern:**
  - Implemented via `ScheduleObserver` and `ConsoleNotifier` to provide real-time notifications of schedule changes, enabling easy integration of new notification channels.
- **Singleton Pattern:**
  - Utilized in `ScheduleManager` to ensure a single, consistent instance manages all scheduling operations throughout the application lifecycle.

## Architecture
- **Controller Layer:** Handles user input and orchestrates application flow (`ScheduleController`).
- **Manager Layer:** Centralized business logic and state management (`ScheduleManager`).
- **Model Layer:** Data representation of tasks and schedules (`Task`).
- **Factory Layer:** Encapsulates object creation logic (`TaskFactory`).
- **Observer Layer:** Decouples notification logic from core scheduling (`ScheduleObserver`, `ConsoleNotifier`).
- **Exception Layer:** Custom exceptions for robust error handling (`InvalidTimeFormatException`, `TaskNotFoundException`).
- **Utility Layer:** Helper classes for input and validation (`InputUtil`).

## Folder Structure
```
src/
└── com/
    └── astronaut/
        ├── app/                # Application entry point
        ├── controller/         # Controllers for business logic
        ├── exception/          # Custom exception classes
        ├── factory/            # Factory for task creation
        ├── manager/            # Singleton schedule management
        ├── model/              # Data models (e.g., Task)
        ├── observer/           # Observer pattern implementation
        ├── util/               # Utility classes
        └── Astronaut_class_diagram.png # Class diagram
```

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools

### Build & Run
1. Clone the repository or download the source code.
2. Open the project in your preferred IDE or navigate to the `src` directory in your terminal.
3. Compile the project:
   ```sh
   javac com/astronaut/app/Main.java
   ```
4. Run the application:
   ```sh
   java com.astronaut.app.Main
   ```

## Usage
- Follow the on-screen prompts to add, update, or remove tasks.
- The application validates input and notifies users of schedule changes via the console.
- All exceptions are handled gracefully, providing clear feedback to the user.

## License
This project is licensed under the MIT License.
