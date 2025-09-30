# Password Strength Checker Console Application

## Overview

This Java console application demonstrates the **Strategy Design Pattern** by allowing users to check the strength of their passwords using different strategies. The application is interactive and guides users to select a password strength checking method at runtime.

## Features

- **Multiple Strength Strategies:**  
  - Length-based check  
  - Number inclusion check  
  - Special character inclusion check  
  - Combination of all checks

- **Strategy Pattern Implementation:**  
  Each password checking method is encapsulated as a separate strategy, promoting flexibility and scalability.

- **User-Friendly Console Interface:**  
  The application prompts users for input and displays clear results.

## How It Works

1. The user enters a password.
2. The user selects a password strength checking strategy:
    - **1:** Length (at least 8 characters)
    - **2:** Contains at least one number
    - **3:** Contains at least one special character (`!@#$%^&*()`)
    - **4:** Combination (all of the above)
3. The application applies the selected strategy and displays whether the password is strong or weak, along with a description of the chosen strategy.

## Usage

1. **Compile all Java files:**
    ```sh
    javac *.java
    ```

2. **Run the application:**
    ```sh
    java Main
    ```

3. **Follow the on-screen prompts:**
    - Enter your password.
    - Choose a strength checking strategy by entering the corresponding number.

## Example

```
Enter your password:
MyPass123!
Choose strength check: 1) Length 2) Number 3) Special Char 4) Combination
4
Password must be at least 8 characters, contain a number, and a special character.
Password strength: Strong
```

## Design Pattern

This application uses the **Strategy Design Pattern** to encapsulate different password strength checking algorithms. This approach allows for easy extension and maintenance, as new strategies can be added without modifying existing code.

## File Structure

- `Main.java` - Entry point and user interaction
- `PasswordCheckerContext.java` - Context class for strategy execution
- `PasswordStrengthStrategy.java` - Strategy interface
- `LengthStrategy.java` - Checks password length
- `NumberStrategy.java` - Checks for numeric characters
- `SpecialCharStrategy.java` - Checks for special characters
- `CombinationStrategy.java` - Checks for all criteria

## License

This project is provided for educational purposes.
