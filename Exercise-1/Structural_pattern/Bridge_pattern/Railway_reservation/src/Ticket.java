// Abstraction
abstract class Ticket {
    protected PaymentMethod paymentMethod;
    protected String passengerName;
    protected String trainNumber;
    protected String source;
    protected String destination;
    protected String date;

    public Ticket(PaymentMethod paymentMethod, String passengerName, String trainNumber, String source, String destination, String date) {
        this.paymentMethod = paymentMethod;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.date = date;
    }

    public abstract void bookTicket();
}

// Refined Abstractions
class RegularTicket extends Ticket {
    public RegularTicket(PaymentMethod paymentMethod, String passengerName, String trainNumber, String source, String destination, String date) {
        super(paymentMethod, passengerName, trainNumber, source, destination, date);
    }

    public void bookTicket() {
        System.out.println("\nBooking Regular Ticket...");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Train: " + trainNumber);
        System.out.println("From: " + source + " To: " + destination);
        System.out.println("Date: " + date);
        paymentMethod.pay(500); // Example fare
        System.out.println("Regular Ticket Booked Successfully!\n");
    }
}

class TatkalTicket extends Ticket {
    public TatkalTicket(PaymentMethod paymentMethod, String passengerName, String trainNumber, String source, String destination, String date) {
        super(paymentMethod, passengerName, trainNumber, source, destination, date);
    }

    public void bookTicket() {
        System.out.println("\nBooking Tatkal Ticket...");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Train: " + trainNumber);
        System.out.println("From: " + source + " To: " + destination);
        System.out.println("Date: " + date);
        paymentMethod.pay(1000); // Example fare
        System.out.println("Tatkal Ticket Booked Successfully!\n");
    }
}