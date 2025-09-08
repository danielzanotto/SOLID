public class Main {
    public static void main(String[] args) {
        // Testing the DocumentoFactory class
        Documento pdf = DocumentoFactory.criarDocumento("PDF");
        Documento docx = DocumentoFactory.criarDocumento("DOCX");

        System.out.println(pdf.getClass().getSimpleName());  // Should print PDF
        System.out.println(docx.getClass().getSimpleName());  // Should print Docx
    }
}

// Documento interface, representing the abstract concept of a document
interface Documento {
    // You can define common methods for all documents here
}

// PDF class implementing Documento
class PDF implements Documento {
    // PDF-specific implementation here
}

// Docx class implementing Documento
class Docx implements Documento {
    // Docx-specific implementation here
}

// DocumentoFactory class that creates Documento objects
class DocumentoFactory {
    // Factory Method - encapsula a lógica de criação de objetos
    public static Documento criarDocumento(String tipo) {
        return switch (tipo) {  // Switch expression (Java 14+)
            case "PDF" -> new PDF();    // Cria PDF
            case "DOCX" -> new Docx(); // Cria DOCX
            default -> throw new IllegalArgumentException("Formato inválido");
        };
    }
}
