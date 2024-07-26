import java.util.*;
public class ass_8 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("The first city: ");
        String city1 = input.nextLine();
        System.out.print("The second city: ");
        String city2 = input.nextLine();
        System.out.print("The third city: ");
        String city3 = input.nextLine();
        System.out.println("The three cities in alphabetical order are:");
        
        if(city1.compareTo(city2)<0 && city1.compareTo(city3)<0)
        {
            System.out.println(city1);
            if(city2.compareTo(city3)<0)
            {
                System.out.println(city2);
                System.out.println(city3);
            }
            else
            {
                System.out.println(city3);
                System.out.println(city2);
            }
        }
        else if(city2.compareTo(city1)<0 && city2.compareTo(city3)<0)
        {
            System.out.println(city2);
            if(city1.compareTo(city3)<0)
            {
                System.out.println(city1);
                System.out.println(city3);
            }
            else
            {
                System.out.println(city3);
                System.out.println(city1);
            }
        }
        else
        {
            System.out.println(city3);
            if (city1.compareTo(city2)<0) 
            {
                System.out.println(city1);
                System.out.println(city2);    
            }
            else
            {
                System.out.println(city2);
                System.out.println(city1);
            }
        }
        input.close();
    }
}
