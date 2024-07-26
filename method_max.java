import java.util.*;
public class method_max 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i,j;
        System.out.println("Input two numbers!");
        i= input.nextInt();
        j = input.nextInt();
        testmax(i, j);
    }
    private static void testmax(int num1, int num2)
    {
        if(num1>num2)
        {
            System.out.println(num1+"is the largest number!");
        }
        else if(num1<num2)
        {
            System.out.println(num2+" is the largest number!");
        }
        else
        {
            System.out.println("Both "+num1+" & "+num2+" are equal!" );
        }
    }
}
