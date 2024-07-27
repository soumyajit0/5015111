package classes;

import interfaces.Document;

public class WordDocument implements Document {
  @Override
  public void create() {
    System.out.println("Word document created.");
  }
}
