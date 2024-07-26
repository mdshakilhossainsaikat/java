import java.util.*;
public class method_gcd 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int i = input.nextInt();
        int j = input.nextInt();
        gcd(i, j);
    }
    private static void gcd (int a, int b)
    {
        int g = 1;
        int k = 2;
        while (k<= a && k<= b)
        {
            if (a%k == 0 && b%k==0)
            {
                g=k;
                k++;
            }
        }
        System.out.println("The greatest common divisor for "+a+" & "+b+" is: "+g);  
    }
}
