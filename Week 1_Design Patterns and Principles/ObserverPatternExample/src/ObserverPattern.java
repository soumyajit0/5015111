import dependencies.MobileApp;
import dependencies.StockMarket;
import dependencies.WebApp;

public class ObserverPattern {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket("Sensex", 100.0);

        MobileApp mobileApp = new MobileApp("Groww");
        WebApp webApp = new WebApp("Wazir");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Updating stock price...");
        stockMarket.setStockPrice(105.0);

        stockMarket.deregisterObserver(webApp);

        System.out.println("Updating stock price again...");
        stockMarket.setStockPrice(110.0);
    }
}
