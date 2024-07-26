import java.util.*;
public class ass_5 
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int nside = input.nextInt();
        System.out.print("Enter the side: ");
        double lside = input.nextDouble();

        double area = (nside*Math.pow(lside, 2))/(4*Math.tan((Math.PI)/nside));
        System.out.println("The area of the polygon is "+area);
        input.close();
    }
}
