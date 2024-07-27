package classes;

import interfaces.Document;

public class ExcelDocument implements Document {
  @Override
  public void create() {
    System.out.println("Excel document created.");
  }
}
