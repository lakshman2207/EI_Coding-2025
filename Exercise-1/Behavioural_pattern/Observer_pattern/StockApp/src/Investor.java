public class Investor implements StockObserver {
    private String investorName;

    public Investor(String name) {
        this.investorName = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[" + investorName + "] Stock " + stockName + " updated to $" + price);
    }

    @Override
    public String toString() {
        return investorName;
    }
}