import order.Order;
import sorting.BubbleSort;
import sorting.QuickSort;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 250.5),
                new Order(2, "Bob", 150.0),
                new Order(3, "Charlie", 350.25),
                new Order(4, "David", 200.75)
        };

        System.out.println("Before Sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[] {
                new Order(1, "Alice", 250.5),
                new Order(2, "Bob", 150.0),
                new Order(3, "Charlie", 350.25),
                new Order(4, "David", 200.75)
        };

        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
