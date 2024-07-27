package classes;

import interfaces.Document;

public class PdfDocument implements Document {
  @Override
  public void create() {
    System.out.println("PDF document created.");
  }
}
