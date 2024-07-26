public class ass2_6 
{
    public static void main(String[] args) 
    {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(34.35);
        System.out.println("Price change percentage: " + oracleStock.getChangePercent() + "%");
    }
}
class Stock 
{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent() 
    {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }
}
