import java.util.Arrays;
import java.util.Comparator;
import product.Product;

public class Search {
  public static Product linearSearch(Product[] products, String targetName) {
    for (Product product : products) {
      if (product.getProductName().equals(targetName)) {
        return product;
      }
    }
    return null;
  }

  public static Product binarySearch(Product[] products, String targetName) {
    int left = 0, right = products.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      int comparison = products[mid].getProductName().compareTo(targetName);
      if (comparison == 0) {
        return products[mid];
      } else if (comparison < 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Product[] products = {
        new Product(1, "Laptop", "Electronics"),
        new Product(2, "Smartphone", "Electronics"),
        new Product(3, "Tablet", "Electronics"),
        new Product(4, "Headphones", "Accessories"),
        new Product(5, "Charger", "Accessories")
    };

    String targetName = "Tablet";
    Product result = linearSearch(products, targetName);
    System.out.println("Linear Search Result: " + result);

    Arrays.sort(products, Comparator.comparing(Product::getProductName));

    result = binarySearch(products, targetName);
    System.out.println("Binary Search Result: " + result);
  }
}
