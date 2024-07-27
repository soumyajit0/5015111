import classes.*;
import interfaces.Document;

public class Main {
  public static void main(String[] args) {
    DocumentFactory wordFactory = new WordDocumentFactory();
    DocumentFactory excelFactory = new ExcelDocumentFactory();
    DocumentFactory pdfFactory = new PdfDocumentFactory();

    Document wordDoc = wordFactory.createDocument();
    wordDoc.create();
    Document excelDoc = excelFactory.createDocument();
    excelDoc.create();
    Document pdfDoc = pdfFactory.createDocument();
    pdfDoc.create();
  }
}
