package classes;

import interfaces.Document;
import classes.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
  @Override
  public Document createDocument() {
    return new WordDocument();
  }
}