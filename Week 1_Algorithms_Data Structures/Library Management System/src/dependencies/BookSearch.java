package dependencies;

import java.util.List;
import dependencies.Book;

public class BookSearch {
  public static Book linearSearchByTitle(List<Book> books, String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return book;
      }
    }
    return null;
  }

  public static Book binarySearchByTitle(List<Book> books, String title) {
    int low = 0;
    int high = books.size() - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      Book midBook = books.get(mid);

      int comparison = midBook.getTitle().compareToIgnoreCase(title);

      if (comparison == 0) {
        return midBook;
      } else if (comparison < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return null;
  }
}
