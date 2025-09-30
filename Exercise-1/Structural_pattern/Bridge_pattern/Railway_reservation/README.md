# Railway Reservation System

This project demonstrates a simple Railway Ticket Reservation System implemented in Java using the Bridge Design Pattern. The system allows users to book either Regular or Tatkal tickets and pay using different payment methods (Credit Card or UPI).

## Features

- Book Regular or Tatkal train tickets
- Choose payment method: Credit Card or UPI
- Simple command-line interface for user input
- Demonstrates the Bridge Pattern by decoupling ticket types from payment methods

## Project Structure

- [`Main.java`](Main.java): Entry point of the application. Handles user input and ticket booking flow.
- [`Ticket.java`](Ticket.java): Contains the `Ticket` abstraction and its concrete implementations (`RegularTicket`, `TatkalTicket`).
- [`PaymentMethod.java`](PaymentMethod.java): Defines the `PaymentMethod` interface and its implementations (`CreditCardPayment`, `UpiPayment`).

## How to Run

1. **Compile the source files:**
    ```sh
    javac Main.java Ticket.java PaymentMethod.java
    ```

2. **Run the application:**
    ```sh
    java Main
    ```

3. **Follow the prompts** to enter passenger details, select ticket type, and choose payment method.

## Example Usage

```
Welcome to the Railway Ticket Reservation System!
Enter Passenger Name: John Doe
Enter Train Number: 12345
Enter Source Station: Chennai
Enter Destination Station: Bangalore
Enter Date of Journey (YYYY-MM-DD): 2024-07-01
Select Ticket Type:
1. Regular
2. Tatkal
2
Select Payment Method:
1. Credit Card
2. UPI
1

Booking Tatkal Ticket...
Passenger: John Doe
Train: 12345
From: Chennai To: Bangalore
Date: 2024-07-01
Paid Rs: 1000.0 using Credit Card.
Tatkal Ticket Booked Successfully!
```

## Design Pattern

This project uses the **Bridge Pattern** to separate the abstraction (`Ticket`) from its implementation (`PaymentMethod`), allowing both to vary independently.

## License

This project is for educational purposes.