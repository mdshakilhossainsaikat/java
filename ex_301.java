import java.util.Scanner;
public class ex_301 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        double a = input.nextDouble();
        System.out.println("Enter value of B: ");
        double b = input.nextDouble();
        System.out.println("Enter value of C: ");
        double c = input.nextDouble();

        double dis = b*b - (4*a*c);

        double r1 = (- b + Math.pow(dis, 0.5))/ (2*a);
        double r2 = (- b - Math.pow(dis, 0.5))/ (2*a);

        if(dis < 0){
            System.out.println("The equation has no real root!");
        }
        else if (dis == 0){
            System.out.println("The equation has only one root!\n"+r1);
        }
        else if (dis >0){
            System.out.println("The equation has two roots!\n"+r1+" and "+r2);
        }
        input.close();
    }
}
