# 📈 Stock Market Observer Pattern Demo

This Java application demonstrates the **Observer Design Pattern** using a simple stock market simulation. Investors can subscribe to stocks and receive notifications whenever stock prices change.

## 📝 Overview

- **Stocks**: Represented by the `Stock` class. Each stock maintains a list of observers (investors).
- **Investors**: Implement the `StockObserver` interface. They receive updates when subscribed stock prices change.
- **Main Application**: Provides a menu-driven console interface to add stocks, add investors, subscribe/unsubscribe investors, update stock prices, and list all stocks.

## 🗂️ Project Structure

```
src/
  Main.java           # Main application entry point
  Stock.java          # Subject class (Observable)
  Investor.java       # Observer implementation
  StockObserver.java  # Observer interface
```

## 🚀 How to Run

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Compilation

```sh
javac src/*.java
```

### Execution

```sh
java -cp src Main
```

## 🖥️ Usage

When you run the application, you'll see a menu:

```
1. Add Stock
2. Add Investor
3. Subscribe Investor to Stock
4. Unsubscribe Investor
5. Update Stock Price
6. List Stocks
7. Exit
```

- **Add Stock**: Enter a stock name and initial price.
- **Add Investor**: Enter an investor name.
- **Subscribe Investor to Stock**: Link an investor to a stock to receive price updates.
- **Unsubscribe Investor**: Remove an investor from a stock's notification list.
- **Update Stock Price**: Change a stock's price and notify all subscribed investors.
- **List Stocks**: View all stocks and their current prices.
- **Exit**: Quit the application.

## 🏗️ Design Pattern

This application uses the **Observer Pattern**:

- `Stock` is the **Subject**. It maintains a list of observers and notifies them of changes.
- `StockObserver` is the **Observer** interface.
- `Investor` implements `StockObserver` and receives updates.

## 📄 Example

```
Enter stock name: ABC
Enter initial price: 100
Stock added.

Enter investor name: Alice
Investor added.

Investor name: Alice
Stock name: ABC
Alice subscribed to ABC

Stock name: ABC
New price: 120
[Alice] Stock ABC updated to $120.0
```

## 📚 Files

- [src/Main.java](src/Main.java)
- [src/Stock.java](src/Stock.java)
- [src/Investor.java](src/Investor.java)
- [src/StockObserver.java](src/StockObserver.java)

---

**Enjoy exploring the Observer Pattern with this interactive stock market demo!**