//public static void printMatrix(int n)
import java.util.*;
public class ass2_2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= input.nextInt();
        printMatrix(n);

    }
    public static void printMatrix(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                int k =(int) (Math.random()*2);
                System.out.print(k+"\t");
            }
            System.out.print("\n");
        }
    }
}
