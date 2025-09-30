/**
 * Concrete implementation of IDocument for Text files
 */
public class TextDocument implements IDocument {
    private String content;
    
    @Override
    public void create() {
        this.content = "Plain Text Content";
        System.out.println("Creating Text document...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving Text document with content: " + content);
    }
    
    @Override
    public void open() {
        System.out.println("Opening Text document. Content: " + content);
    }
    
    @Override
    public String getType() {
        return "Text";
    }
}
