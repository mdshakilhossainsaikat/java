import java.util.*;
public class ass_11 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int p = input.nextInt();
        System.out.print("Number of Years: ");
        int t = input.nextInt();
        double r;
        System.out.println("Interest\tMonthly\t\tTotal\nrate:\t\tpaymetn:\tpaymetn:");
        for(r=5; r<= 8; r+=0.125)
        {
            System.out.printf("%.3f%%\t\t%.2f\t\t%.2f\n", r, pm(p, r/100,t), (pm(p, r/100, t)*12*t));                           
        }
    }
    public static double pm(int p,double r, int t)
    {
        double a = Math.pow((1+r/12), (12*t));
        double permonth = (p*(r/12)*a)/(a-1);
        return permonth;
    }
}
