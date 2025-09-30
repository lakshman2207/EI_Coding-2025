/**
 * Concrete implementation of IDocument for Word files
 */
public class WordDocument implements IDocument {
    private String content;
    
    @Override
    public void create() {
        this.content = "Word Document Content";
        System.out.println("Creating Word document...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving Word document with content: " + content);
    }
    
    @Override
    public void open() {
        System.out.println("Opening Word document. Content: " + content);
    }
    
    @Override
    public String getType() {
        return "Word";
    }
}
