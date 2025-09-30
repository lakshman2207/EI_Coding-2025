import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Stock> stocks = new HashMap<>();
        Map<String, Investor> investors = new HashMap<>();

        System.out.println("\n1. Add Stock\n2. Add Investor\n3. Subscribe Investor to Stock\n4. Unsubscribe Investor\n5. Update Stock Price\n6. List Stocks\n7. Exit");
        while (true) {
            System.out.print("\nChoose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter stock name: ");
                    String sName = sc.nextLine();
                    System.out.print("Enter initial price: ");
                    double price = sc.nextDouble();
                    stocks.put(sName, new Stock(sName, price));
                    System.out.println("Stock added.");
                    break;
                case 2:
                    System.out.print("Enter investor name: ");
                    String iName = sc.nextLine();
                    investors.put(iName, new Investor(iName));
                    System.out.println("Investor added.");
                    break;
                case 3:
                    System.out.print("Investor name: ");
                    String invName = sc.nextLine();
                    System.out.print("Stock name: ");
                    String stName = sc.nextLine();
                    if (investors.containsKey(invName) && stocks.containsKey(stName)) {
                        stocks.get(stName).addObserver(investors.get(invName));
                        System.out.println(invName + " subscribed to " + stName);
                    } else {
                        System.out.println("Invalid investor or stock.");
                    }
                    break;
                case 4:
                    System.out.print("Investor name: ");
                    String invName2 = sc.nextLine();
                    System.out.print("Stock name: ");
                    String stName2 = sc.nextLine();
                    if (investors.containsKey(invName2) && stocks.containsKey(stName2)) {
                        stocks.get(stName2).removeObserver(investors.get(invName2));
                        System.out.println(invName2 + " unsubscribed from " + stName2);
                    } else {
                        System.out.println("Invalid investor or stock.");
                    }
                    break;
                case 5:
                    System.out.print("Stock name: ");
                    String stockToUpdate = sc.nextLine();
                    if (stocks.containsKey(stockToUpdate)) {
                        System.out.print("New price: ");
                        double newPrice = sc.nextDouble();
                        stocks.get(stockToUpdate).setPrice(newPrice);
                    } else {
                        System.out.println("Stock not found.");
                    }
                    break;
                case 6:
                    System.out.println("Stocks:");
                    for (Stock stock : stocks.values()) {
                        System.out.println(stock.getName() + " - $" + stock.getPrice());
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}