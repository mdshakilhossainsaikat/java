
import java.util.*;
public class ass2_5 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();
        System.out.print("Enter the specific cherecter: ");
        char a =input.next().charAt(0);
        System.out.println("In the word "+str+" the specific letter "+a+" occoured "+count(str, a)+" times.");
    }
    public static int count(String str, char a)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char letsee = str.charAt(i);
            if (Character.isLetter(letsee) && letsee== a) 
            {
                count++;
            }
        }
        return count;
    }
}
