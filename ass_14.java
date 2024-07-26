import java.util.*;
public class ass_14 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");      
        short user = input.nextShort();
        
        for(int i = 15; i>=0; i--)
        {
            int number = (user>>i)&1;
            System.out.print(number);
        }
    }
}
