import java.util.HashMap;
import java.util.Map;
import product.Product;

public class InventoryManagementSystem {
  private Map<String, Product> inventory;

  public InventoryManagementSystem() {
    inventory = new HashMap<>();
  }

  public void addProduct(Product product) {
    inventory.put(product.getProductId(), product);
  }

  public void updateProduct(Product product) {
    if (inventory.containsKey(product.getProductId())) {
      inventory.put(product.getProductId(), product);
    } else {
      System.out.println("Product not found in inventory.");
    }
  }

  public void deleteProduct(String productId) {
    if (inventory.containsKey(productId)) {
      inventory.remove(productId);
    } else {
      System.out.println("Product not found in inventory.");
    }
  }

  public void displayProducts() {
    for (Product product : inventory.values()) {
      System.out.println(product);
    }
  }

  public static void main(String[] args) {
    InventoryManagementSystem ims = new InventoryManagementSystem();

    Product p1 = new Product("P001", "Product 1", 10, 100.0);
    Product p2 = new Product("P002", "Product 2", 5, 200.0);
    Product p3 = new Product("P003", "Product 3", 20, 150.0);

    ims.addProduct(p1);
    ims.addProduct(p2);
    ims.addProduct(p3);

    System.out.println("Initial Inventory:");
    ims.displayProducts();

    p2.setQuantity(15);
    ims.updateProduct(p2);

    System.out.println("Updated Inventory:");
    ims.displayProducts();

    ims.deleteProduct("P003");

    System.out.println("Final Inventory:");
    ims.displayProducts();
  }
}
