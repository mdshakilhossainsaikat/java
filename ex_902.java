public class ex_902 {
    public static void main(String[]args){
        Stock object = new Stock("ORCL", "Oracle Corporation");

        object.setpreviousClosingPrice(34.5);
        object.setcurrentPrice(34.35);

        System.out.println("Price change percentage is: "+object.getPriceChange());
    }
}
class Stock{
    private String symble;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symble, String name)
    {
        this.symble = symble;
        this.name = name;
    }

    public void setpreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setcurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public double getPriceChange(){
        double percentage = (Math.abs(currentPrice-previousClosingPrice)*100)/previousClosingPrice;
        return percentage;
    }


}