import java.util.*;
public class points {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x,y;
        double dis;
        
        System.out.println("Enter your coordinates: ");
        x = input.nextInt();
        y = input.nextInt();
        
        dis = Math.pow(((x*x)+(y*y)),.5);
        
        if(dis <= 10){
            System.out.println("The point is in the circle");
        }
        else{
            System.out.println("The point is outside of the circle");
        }
        
    }
    
}
