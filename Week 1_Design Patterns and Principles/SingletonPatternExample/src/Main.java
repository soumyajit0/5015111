import logger.Logger;

public class Main {
    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        obj1.body = "Soumyajit";

        System.out.println(obj2.body);
    }
}
