import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new BasicCoffee();

        System.out.println("Base Coffee Selected: Plain Coffee Rs.50)");

        while (true) {
            System.out.println("\nChoose an extra to add:");
            System.out.println("1. Add Milk (Rs.15)");
            System.out.println("2. Add Sugar (Rs.10)");
            System.out.println("3. Finish and show bill");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    System.out.println("Milk added!");
                    break;
                case 2:
                    coffee = new SugarDecorator(coffee);
                    System.out.println("Sugar added!");
                    break;
                case 3:
                    System.out.println("\nFinal Order: " + coffee.getDescription());
                    System.out.println("Total Cost Rs: " + coffee.getCost());
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}