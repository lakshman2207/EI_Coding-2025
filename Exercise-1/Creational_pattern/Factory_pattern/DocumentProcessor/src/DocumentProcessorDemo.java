/**
 * Demo class to demonstrate Factory Method pattern
 */
public class DocumentProcessorDemo {
    public static void main(String[] args) {
        System.out.println("=== FACTORY METHOD PATTERN DEMO ===");
        System.out.println("Document Processing System\n");
        
        // Create a document factory
        DocumentFactory factory = new StandardDocumentFactory();
        
        // Process different types of documents
        factory.processDocument("PDF");
        factory.processDocument("Word");
        factory.processDocument("Text");
        factory.processDocument("TXT");
        factory.processDocument("DOCX");
        
        // Try unsupported document type
        factory.processDocument("XML");
        
        System.out.println("Factory Method Pattern allows:");
        System.out.println("1. Creating objects without specifying exact classes");
        System.out.println("2. Easy addition of new document types");
        System.out.println("3. Centralized object creation logic");
    }
}
