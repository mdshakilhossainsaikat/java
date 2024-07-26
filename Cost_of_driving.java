import java.util.Scanner;
public class Cost_of_driving {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float dis, mileage, price, cost;
        System.out.print("enter the driving distanc: ");
        dis = input.nextFloat();
        System.out.print("Enter mile per gallon: ");
        mileage = input.nextFloat();
        System.out.print("Enter price per gellon: ");
        price = input.nextFloat();
        cost = (dis/mileage)*price;
        System.out.println("the cost of driving is: "+cost);
        input.close();
    }

}
