import java.util.Scanner;
public class ass2_3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String user = scanner.nextLine();
        
        if (goodtogo(user)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean goodtogo(String user) 
    {
        if (user.length() < 8) 
        {
            return false;
        }
        for (int i = 0; i < user.length(); i++)
        {
            char letsee = user.charAt(i);
            if (!Character.isLetterOrDigit(letsee)) 
            {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < user.length(); i++) 
        {
            char letsee = user.charAt(i);
            if (Character.isDigit(letsee)) 
            {
                count++;
            }
        }
        return count >= 2;
    }
}
