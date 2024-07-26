import java.util.*;
public class ass_2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int bot = (int) (Math.random()*899)+100;
        int botc = bot%10;
        int botgen2 = bot/10;
        int botb = botgen2%10;
        int botgen1 = botgen2/10;
        int bota = botgen1%10;

        System.out.print("Enter your lottery number here: ");
        int user = input.nextInt();
        int userc = user%10;
        int usergen2 = user/10;
        int userb = usergen2%10;
        int usergen1 = usergen2/10;
        int usera = usergen1%10;

        if(bota==usera && botb==userb && botc==userc)
        {
            System.out.println("The award is $10,000");
        }
        else if((bota== usera || bota== userb|| bota== userc) && (botb== usera || botb== userb || botb== userc) && (botc== usera || botc== userb || botc== userc))
        {
            System.out.println("The award is $3,000.");
        }
        else if(bota== usera || bota== userb|| bota== userc ||botb== usera || botb== userb || botb== userc ||botc== usera || botc== userb || botc== userc)
        {
            System.out.println("The award is $1,000.");
        }
        else{
            System.out.println("No award for you.");
        }
        input.close();
    }
}