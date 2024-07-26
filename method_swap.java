import java.util.*;
public class method_swap 
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int i = input.nextInt();
        int j = input.nextInt();
        swap(i, j);
    }
    public static void swap(int a, int b)
    {
        System.out.println("Before swap number 1: "+a+"\nBefore swap number 2: "+b);
        int tem = a;
        a= b;
        b = tem;
        System.out.println("After swap number 1: "+a+"\nAfter swap number 2: "+b);
    }
}
