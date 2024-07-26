import java.util.*;
public class ass_3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int bot = (int)(Math.random()*3);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();
        if(bot==0)
        {
            if(user == 1)
            {
                System.out.println("The computer is Scissor. You are rock. You Won");
            }
            else if (user == 2)
            {
                System.out.println("The computer is Scissor. You are paper. Computer Won");
            }
            else if (user == 0)
            {
                System.out.println("The computer is Scissor. You are Scissor. It is a draw");
            }
        }
        else if(bot==1)
        {
            if(user == 1)
            {
                System.out.println("The computer is rock. You are rock. It is a draw");
            }
            else if (user == 2)
            {
                System.out.println("The computer is rock. You are paper. You Won");
            }
            else if (user == 0)
            {
                System.out.println("The computer is rock. You are Scissor. Computer Won");
            }
        }
        else if(bot==3)
        {
            if(user == 1)
            {
                System.out.println("The computer is paper. You are rock. Computer Won");
            }
            else if (user == 2)
            {
                System.out.println("The computer is paper. You are paper. It is a draw");
            }
            else if (user == 0)
            {
                System.out.println("The computer is paper. You are Scissor. You Won");
            }
        }
    }
}
