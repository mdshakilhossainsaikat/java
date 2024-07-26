import java.util.Scanner;
class MyStack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) 
    {
        stackArray[++top] = value;
    }
    public int pop() 
    {
        return stackArray[top--];
    }
    public boolean isEmpty() 
    {
        return (top == -1);
    }
}
public class ass3_3 
{
    public static void smallestFactors(int n) 
    {
        MyStack stack = new MyStack(100);
        int factor = 2;
        while (n > 1) 
        {
            if (n % factor == 0) 
            {
                stack.push(factor);
                n /= factor;
            } 
            else 
            {
                factor++;
            }
        }
        System.out.print("Smallest factors in decreasing order: ");
        while (!stack.isEmpty()) 
        {
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num <= 0) 
        {
            System.out.println("Please enter a positive integer.");
        } 
        else 
        {
            smallestFactors(num);
        }
        scanner.close();
    }
}