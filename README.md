# EI_Coding — Design Pattern Exercises (Exercise-1 & Exercise-2)

Professional collection of small Java projects demonstrating common design patterns and modular code organization, created for educational and demonstration purposes.

## Contents

- Exercise-1: A set of small Java programs organized by design pattern categories:
  - Behavioural patterns
    - Observer pattern — `Exercise-1/Behavioural_pattern/Observer_pattern/StockApp`
    - Strategy pattern — `Exercise-1/Behavioural_pattern/Strategy_pattern/Password_Checker`
  - Creational patterns
    - Builder pattern — `Exercise-1/Creational_pattern/Builder_pattern/SpaceMission`
    - Factory pattern — `Exercise-1/Creational_pattern/Factory_pattern/DocumentProcessor`
  - Structural patterns
    - Bridge pattern — `Exercise-1/Structural_pattern/Bridge_pattern/Railway_reservation`
    - Decorator pattern — `Exercise-1/Structural_pattern/Decorator_pattern/CoffeeMaker`

- Exercise-2: A small Java application under `Exercise-2/src/com/astronaut` with a simple task scheduling app showcasing modular design, factories, exceptions, and observer usage.

## Project goals

- Provide clear, small, self-contained examples of common object-oriented design patterns.
- Serve as teaching material and quick references for students learning design patterns in Java.
- Be easy to run locally and inspect source code for each pattern's responsibilities and collaborations.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- A Java build tool or IDE (javac/java on command line, or IntelliJ IDEA, Eclipse, VS Code + Java extensions)

> Note: Each example is a small standalone Java program. There is no top-level build system in this repository — run each sample from its `src` directory using javac/java or import the folder into your IDE as a Java project.

## How to run the examples (command line)

Below are sample commands you can run from Windows PowerShell. Adjust the paths if your workspace root differs.

1) Observer pattern (StockApp)

```powershell
cd Exercise-1\Behavioural_pattern\Observer_pattern\StockApp\src
javac *.java
java Main
```

2) Strategy pattern (Password Checker)

```powershell
cd Exercise-1\Behavioural_pattern\Strategy_pattern\Password_Checker\src
javac *.java
java Main
```

3) Builder pattern (SpaceMission)

```powershell
cd Exercise-1\Creational_pattern\Builder_pattern\SpaceMission\src
javac *.java
java Main
```

4) Factory pattern (DocumentProcessor)

```powershell
cd Exercise-1\Creational_pattern\Factory_pattern\DocumentProcessor\src
javac *.java
java Main
```

5) Bridge pattern (Railway Reservation)

```powershell
cd Exercise-1\Structural_pattern\Bridge_pattern\Railway_reservation\src
javac *.java
java Main
```

6) Decorator pattern (CoffeeMaker)

```powershell
cd Exercise-1\Structural_pattern\Decorator_pattern\CoffeeMaker\src
javac *.java
java Main
```

7) Exercise-2 (Astronaut Task Scheduler)

```powershell
cd Exercise-2\src
javac -d out com/astronaut/app/Main.java com/astronaut/**/**/*.java
java -cp out com.astronaut.app.Main
```

Notes:
- Some examples use packages; the javac/java commands above are minimal. For package-based source (like Exercise-2), compile into an output directory (`-d out`) and run with the appropriate classpath and fully-qualified main class name.
- If you prefer, open the project in an IDE and run the `Main` class for each example.

## Project structure (high-level)

- Exercise-1 — grouped by pattern category with each example in its own folder and a simple `src` package-less or package-based layout. Good for quick inspection and manual compilation.
- Exercise-2 — a slightly more structured Java package layout under `com.astronaut` showing a small app with controllers, managers, factories, exceptions, and observers.

## Notes on code quality and expectations

- These are educational examples: clarity and demonstrating the pattern are prioritized over production concerns.
- Feel free to refactor, add tests, or wire up a build system (Maven/Gradle) if you want to integrate them into larger projects.

