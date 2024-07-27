import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import dependencies.Book;
import dependencies.BookSearch;

public class Main {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book(1, "Java Programming", "John Doe"));
    books.add(new Book(2, "Data Structures", "Jane Smith"));
    books.add(new Book(3, "Algorithms", "Alan Turing"));

    books.sort(Comparator.comparing(Book::getTitle));

    Book foundBookLinear = BookSearch.linearSearchByTitle(books, "Data Structures");
    System.out.println("Linear Search Result: " + (foundBookLinear != null ? foundBookLinear : "Book not found"));

    Book foundBookBinary = BookSearch.binarySearchByTitle(books, "Data Structures");
    System.out.println("Binary Search Result: " + (foundBookBinary != null ? foundBookBinary : "Book not found"));
  }
}
