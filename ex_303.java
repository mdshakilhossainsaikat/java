import java.util.*;
public class ex_303 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double x = (e*d - b*f)/(a*d - b*c);
        double y = (a*f - e*c)/(a*d - b*c);
        if(((a*d) - (b*c))==0){
            System.out.println("The equation has no solution!");
        }
        else{
            //System.out.printf("X is: %llf\nY is: %llf",x,y);
            System.out.println(x);
            System.out.println(y);
        }
        input.close();
    }
}