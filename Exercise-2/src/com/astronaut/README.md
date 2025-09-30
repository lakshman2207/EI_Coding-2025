# Astronaut Task Scheduler

A Java-based application for managing and scheduling astronaut tasks efficiently. This project demonstrates object-oriented design principles, including the use of controllers, factories, observers, and custom exceptions.

## Features

- Add, update, and remove astronaut tasks
- Schedule management with validation
- Console notifications for schedule changes
- Modular and extensible architecture

## Folder Structure

```
src/
└── com/
    └── astronaut/
        ├── app/                # Application entry point
        ├── controller/         # Controllers for business logic
        ├── exception/          # Custom exception classes
        ├── factory/            # Factory for task creation
        ├── manager/            # Schedule management logic
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

## Design Patterns Used

- **Factory Pattern:** For task creation (`TaskFactory`)
- **Observer Pattern:** For schedule notifications (`ScheduleObserver`, `ConsoleNotifier`)
- **Custom Exceptions:** For robust error handling (`InvalidTimeFormatException`, `TaskNotFoundException`)

## Class Diagram

See `src/com/astronaut/Astronaut_class_diagram.png` for an overview of the class relationships.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
