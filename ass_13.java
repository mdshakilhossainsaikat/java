import java.util.Scanner;
public class ass_13 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int user = input.nextInt();
        System.out.println("Octal value: " + converter(user));

        input.close();
    }
    public static String converter(int user) 
    {
        if (user == 0) {
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        while (user != 0) 
        {
            int rem = user % 8;
            ans.insert(0, rem);
            user /= 8;
        }
        return ans.toString();
    }
}
