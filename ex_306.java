// bmi = kg/m^2;
//multiplying the given pound value and 0.45359237
//1 foot = 0.3048 m
//dividing the given length in inches by 12
import java.util.*;
public class ex_306 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double bmi, mass, foot, inch, pound, hight;
        System.out.print("Enter your boby weigth in pounds: ");
        pound = input.nextDouble();
        System.out.print("Enter your body hight in foot: ");
        foot = input.nextDouble();
        System.out.print("Enter your body hight in inches: ");
        inch = input.nextDouble();
        
        mass = pound*0.45359237;
        hight  = (foot+(inch/12))*0.3048;
        bmi = mass/(hight*hight);
        
        System.out.println("Your BMI is "+bmi);
        input.close();
    }
}
