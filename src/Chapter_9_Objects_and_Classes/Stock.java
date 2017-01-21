package Chapter_9;

public class Stock {
    
    private String symbol, name;
    double previousClosingPrice, currentPrice;
    
    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    double getChangePercent(double fp, double sp) {
        return fp / sp * 100;
    }
    void upOrDown(double previousClosingPrice, double currentPrice) {
        double difference = previousClosingPrice - currentPrice;
        if (difference == 0)
            System.out.print("0% No change in the price");
        else if (difference < 0) 
            System.out.printf("%1.2f%% Up", Math.abs(difference) / currentPrice * 100);
        else 
            System.out.printf("%1.2f%% Down", Math.abs(difference) / currentPrice * 100);
    }
    
}
