import logger.Logger;

public class Main {
    public static void main(String[] args) {
        // Creating two references to the Logger singleton instance
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        // Printing the references to demonstrate both point to the same instance
        System.out.println(obj1);
        System.out.println(obj2);

        // Setting the 'body' field of the first Logger instance
        obj1.body = "Soumyajit";

        // Printing the 'body' field from the second Logger instance to show they are
        // the same instance
        System.out.println(obj2.body);
    }
}
