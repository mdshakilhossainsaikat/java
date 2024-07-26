import java.util.*;
public class ass2_1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (isPalindrome(number)) 
        {
            System.out.println(number + " is a palindrome.");
        } 
        else 
        {
            System.out.println(number + " is not a palindrome.");
        }
    }
    public static int reverse(int number)
    {
        int temp = 0;
        while(number!= 0)
        {
            int a = number% 10;
            temp = temp*10+a;
            number/=10;
        }
        return temp;
    }
    public static boolean isPalindrome(int number)
    {
        return (number == reverse(number));
    }
}
