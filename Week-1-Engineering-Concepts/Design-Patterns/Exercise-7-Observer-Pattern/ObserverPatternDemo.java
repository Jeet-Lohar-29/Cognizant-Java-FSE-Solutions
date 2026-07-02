/**
 * Demonstrates the Observer Pattern.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("TCS", 4250.50);

        stockMarket.setStockPrice("Infosys", 1689.75);

    }

}