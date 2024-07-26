import java.util.*;
public class ass_4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinets.");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double dis = Math.pow(((x*x)+(y*y)), .5);
        System.out.println(dis);
    
        if(dis<=10)
        {
            System.out.println("The point is within the circle.");
        }
        else
        {
            System.out.println("The point is outside of the circle.");
        }
        input.close();
    }    
}
