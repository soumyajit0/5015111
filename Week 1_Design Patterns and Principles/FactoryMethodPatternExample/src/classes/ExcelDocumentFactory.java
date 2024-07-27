package classes;

import interfaces.Document;
import classes.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
  @Override
  public Document createDocument() {
    return new ExcelDocument();
  }
}