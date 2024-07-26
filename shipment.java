import java.util.*;
public class shipment {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double cost;
        System.out.println("Enter the weight: ");
        double pacw = input.nextFloat();
        
        if (pacw > 0 && pacw <= 1){
            cost = pacw * 3.5;
            System.out.println("Cost of shipment is: "+cost);
        }
        else if (pacw > 1 && pacw <= 3){
            cost = pacw * 5.5;
            System.out.println("Cost of shipment is: "+cost);
        }
        else if (pacw > 3 && pacw <= 10){
            cost = pacw * 8.5;
            System.out.println("Cost of shipment is: "+cost);
        }
        else if (pacw > 10 && pacw <= 20){
            cost = pacw * 10.5;
            System.out.println("Cost of shipment is: "+cost);
        }
        else if (pacw > 20){
            System.out.println("This package cannot be shiped");
        }
    }
}
