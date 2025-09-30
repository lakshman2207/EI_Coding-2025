# Coffee Shop Decorator Pattern Application

## Overview

This Java application demonstrates the **Decorator Design Pattern** by simulating a customizable coffee ordering system. Users can select a base coffee and dynamically add extras such as milk and sugar, with the total cost and description updated accordingly.

## Features

- **Base Coffee Selection:** Start with a plain coffee.
- **Dynamic Add-ons:** Add milk and/or sugar as desired.
- **Real-time Billing:** View the updated description and total cost after each addition.
- **User-Friendly Interface:** Simple console-based menu for interaction.

## Design Pattern

This project utilizes the **Decorator Pattern** to add responsibilities (milk, sugar) to the base coffee object at runtime without modifying its structure. Each add-on is implemented as a decorator class that extends the functionality of the base coffee.

## File Structure

- [`src/Coffee.java`](src/Coffee.java): Coffee interface defining the contract for coffee objects.
- [`src/BasicCoffee.java`](src/BasicCoffee.java): Concrete implementation of a plain coffee.
- [`src/CoffeeDecorator.java`](src/CoffeeDecorator.java): Abstract decorator class implementing the Coffee interface.
- [`src/MilkDecorator.java`](src/MilkDecorator.java): Decorator for adding milk.
- [`src/SugarDecorator.java`](src/SugarDecorator.java): Decorator for adding sugar.
- [`src/Main.java`](src/Main.java): Main class containing the application entry point and user interaction logic.

## How to Run

1. **Compile the source files:**
    ```sh
    javac src/*.java
    ```

2. **Run the application:**
    ```sh
    java -cp src Main
    ```

3. **Follow the on-screen prompts** to add extras and view your final bill.

## Example Usage

```
Base Coffee Selected: Plain Coffee Rs.50)

Choose an extra to add:
1. Add Milk (Rs.15)
2. Add Sugar (Rs.10)
3. Finish and show bill
Enter your choice: 1
Milk added!

Choose an extra to add:
1. Add Milk (Rs.15)
2. Add Sugar (Rs.10)
3. Finish and show bill
Enter your choice: 2
Sugar added!

Choose an extra to add:
1. Add Milk (Rs.15)
2. Add Sugar (Rs.10)
3. Finish and show bill
Enter your choice: 3

Final Order: Plain Coffee, Milk, Sugar
Total Cost Rs: 75.0
```

## License

This project is for educational purposes.