import java.util.*;

public class Stock {
    private String name;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }
}