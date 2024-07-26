import java.util.*;
public class ass_6 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char user = input.nextLine().charAt(0);
        int r = (int) user;
        System.out.println("The Unicode for the character "+user+" is "+r);
        input.close();
    }
}
