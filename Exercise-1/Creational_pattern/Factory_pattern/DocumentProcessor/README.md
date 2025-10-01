## Document Processor (Factory Method Pattern)

This is a simple Java console application that demonstrates the Factory Method pattern by creating and processing different types of documents (PDF, Word, Text).

## Overview

- **Pattern**: Factory Method
- **Goal**: Create documents without coupling client code to concrete classes.
- **Key types**:
  - `IDocument` (Product interface)
  - `PDFDocument`, `WordDocument`, `TextDocument` (Concrete Products)
  - `DocumentFactory` (Creator/abstract factory)
  - `StandardDocumentFactory` (Concrete Creator)
  - `DocumentProcessorDemo` (Non-interactive demo with predefined examples)
  - `Main` (Optional interactive entry point that reads user input, if present)

## Project Structure

```
Factory_pattern/
  DocumentProcessor/
    DocumentFactory.java
    DocumentProcessorDemo.java
    IDocument.java
    PDFDocument.java
    StandardDocumentFactory.java
    TextDocument.java
    WordDocument.java
    Main.java
```

## Prerequisites

- Java 8+ (JDK) installed
- PowerShell or a terminal

## Build

From the project root `Factory_pattern`, compile all sources:

```bash
javac DocumentProcessor\*.java
```

## Run (Predefined Demo)

Runs the demo that processes several document types (including an unsupported one) to showcase behavior:

```bash
java -cp DocumentProcessor DocumentProcessorDemo
```

Expected output includes lines like:

```text
=== FACTORY METHOD PATTERN DEMO ===
Document Processing System
=== Document Processing Started ===
Creating PDF document...
Saving PDF document with content: PDF Document Content
Opening PDF document. Content: PDF Document Content
Document type: PDF
=== Document Processing Completed ===
...
Unsupported document type: XML
```

## Run (Interactive, if `Main.java` exists)

If you have an interactive `Main.java` in `DocumentProcessor`, you can run it to enter document types at runtime:

```bash
java -cp DocumentProcessor Main
```

Then type values like `pdf`, `word`, or `text`, or `exit` to quit.

## How It Works

1. Client code asks the factory (`StandardDocumentFactory`) to `createDocument(documentType)`.
2. The factory instantiates the matching concrete product (e.g., `PDFDocument`).
3. The template method `processDocument` in `DocumentFactory` coordinates `create`, `save`, and `open` on the product.

## Adding a New Document Type

- Create a new class implementing `IDocument` (e.g., `MarkdownDocument`).
- Add a case in `StandardDocumentFactory#createDocument` to return your new class for a given type string (e.g., `"md"` or `"markdown"`).
- Recompile and run the demo or interactive main.

Example switch addition in `StandardDocumentFactory`:

```java
case "md":
case "markdown":
    return new MarkdownDocument();
```

## Troubleshooting

- If `java` cannot find the class, ensure you used `-cp DocumentProcessor` and compiled with `javac DocumentProcessor\*.java`.
- If you see "Unsupported document type", verify your input matches one of: `pdf`, `word`/`doc`/`docx`, `text`/`txt`.

## License

Use as you wish for learning and demos.


