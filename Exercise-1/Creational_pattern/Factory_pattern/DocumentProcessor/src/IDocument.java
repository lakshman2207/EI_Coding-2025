/**
 * Interface for different types of documents
 * This is the Product interface in Factory Method pattern
 */
public interface IDocument {
    void create();
    void save();
    void open();
    String getType();
}
