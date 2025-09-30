/**
 * Concrete implementation of IDocument for PDF files
 */
public class PDFDocument implements IDocument {
    private String content;
    
    @Override
    public void create() {
        this.content = "PDF Document Content";
        System.out.println("Creating PDF document...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving PDF document with content: " + content);
    }
    
    @Override
    public void open() {
        System.out.println("Opening PDF document. Content: " + content);
    }
    
    @Override
    public String getType() {
        return "PDF";
    }
}
