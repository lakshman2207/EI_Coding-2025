/**
 * Entry point for the Document Processor application
 * Reads document types from the user and processes them via Factory Method
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FACTORY METHOD PATTERN: DOCUMENT PROCESSOR ===");
        System.out.println("Type a document format to process (e.g., pdf, word, text). Type 'exit' to quit.\n");

        DocumentFactory factory = new StandardDocumentFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter document type (pdf/word/text) or 'exit': ");
            String input = scanner.nextLine();

            if (input == null) {
                System.out.println("No input detected. Exiting.");
                break;
            }

            String documentType = input.trim();
            if (documentType.isEmpty()) {
                System.out.println("Please enter a valid document type.");
                continue;
            }

            if (documentType.equalsIgnoreCase("exit") || documentType.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            factory.processDocument(documentType);
        }
    }
}


