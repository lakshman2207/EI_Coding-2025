/**
 * Concrete Creator class in Factory Method pattern
 * Implements the factory method to create standard document types
 */
public class StandardDocumentFactory extends DocumentFactory {
    
    @Override
    public IDocument createDocument(String documentType) {
        switch (documentType.toLowerCase()) {
            case "pdf":
                return new PDFDocument();
            case "word":
            case "doc":
            case "docx":
                return new WordDocument();
            case "text":
            case "txt":
                return new TextDocument();
            default:
                return null;
        }
    }
}
