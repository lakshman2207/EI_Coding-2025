import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Railway Ticket Reservation System!");

        System.out.print("Enter Passenger Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Train Number: ");
        String trainNumber = scanner.nextLine();

        System.out.print("Enter Source Station: ");
        String source = scanner.nextLine();

        System.out.print("Enter Destination Station: ");
        String destination = scanner.nextLine();

        System.out.print("Enter Date of Journey (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.println("Select Ticket Type:");
        System.out.println("1. Regular");
        System.out.println("2. Tatkal");
        int ticketType = scanner.nextInt();

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        int paymentType = scanner.nextInt();

        PaymentMethod paymentMethod;
        if (paymentType == 2) {
            paymentMethod = new UpiPayment();
        } else {
            paymentMethod = new CreditCardPayment();
        }

        Ticket ticket;
        if (ticketType == 2) {
            ticket = new TatkalTicket(paymentMethod, name, trainNumber, source, destination, date);
        } else {
            ticket = new RegularTicket(paymentMethod, name, trainNumber, source, destination, date);
        }

        ticket.bookTicket();
        scanner.close();
    }
}