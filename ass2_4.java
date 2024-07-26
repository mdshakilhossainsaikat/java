//public static int countLetters(String s)
import java.util.*;
public class ass2_4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = input.nextLine();
        System.out.println("Letters in the word is: "+countLetters(s));
    }
    public static int countLetters(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char letsee = s.charAt(i);
            if (Character.isLetter(letsee)) 
            {
                count++;
            }
        }
        return count;
    }
}
