import java.util.*;
public class ex_302 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,sum;

        System.out.println("Here are three numbers!");
        a = (int)(Math.random()*99);
        b = (int)(Math.random()*99);
        c = (int)(Math.random()*99);
        System.out.println("A: "+a+"\nB: "+b+"\nC: "+c);

        System.out.print("\n\nEnter the sum of these numbers: ");
        sum = input.nextInt();

        if(sum == a+b+c){
            System.out.printf("\n\nYou entered the sum of %d, %d & %d is %d.\nThe answer is correct.\n", a,b,c,sum);
        }
        else{
            System.out.printf("\n\nYou entered the sum of %d, %d & %d is %d.\nThe answer is not correct.\n", a,b,c,sum);
        }
        input.close();

    }
}
