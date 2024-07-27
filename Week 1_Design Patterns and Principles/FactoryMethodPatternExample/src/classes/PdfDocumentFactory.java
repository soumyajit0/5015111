package classes;

import interfaces.Document;
import classes.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
  @Override
  public Document createDocument() {
    return new PdfDocument();
  }
}