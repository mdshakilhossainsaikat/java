import java.util.Scanner;
public class ass_15 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double user[] = new double[10];
        for (int i = 0; i < 10; ++i) 
        {
        user[i] = input.nextDouble();
        }
        double mean = (sum(user)) / 10;
        System.out.print("The mean is: "+ mean);
        double sd = Math.sqrt((sqarSum(user) - (sum(user) * sum(user) / 10)) / (10 - 1));
        System.out.print("\nThe standard desiation is: "+ sd);
    }
    public static double sum(double user[]) 
    {
        double sum = 0;
        for (int i = 0; i < 10; ++i) 
        {
            sum += user[i];
        }
        return sum;
    }
    public static double sqarSum(double user[]) 
    {
        double sqarSum = 0;
        for (int i = 0; i < 10; ++i) 
        {
            sqarSum += user[i] * user[i];
        }
        return sqarSum;
    }
}