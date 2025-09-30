/**
 * Abstract Creator class in Factory Method pattern
 * This defines the factory method that subclasses will implement
 */
public abstract class DocumentFactory {
    
    /**
     * Factory method - to be implemented by concrete factories
     * @param documentType Type of document to create
     * @return IDocument instance
     */
    public abstract IDocument createDocument(String documentType);
    
    /**
     * Template method that uses the factory method
     * @param documentType Type of document to process
     */
    public void processDocument(String documentType) {
        System.out.println("=== Document Processing Started ===");
        IDocument document = createDocument(documentType);
        
        if (document != null) {
            document.create();
            document.save();
            document.open();
            System.out.println("Document type: " + document.getType());
        } else {
            System.out.println("Unsupported document type: " + documentType);
        }
        System.out.println("=== Document Processing Completed ===\n");
    }
}
