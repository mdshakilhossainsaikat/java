import java.util.Scanner;
public class convertem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ce, fa;
        System.out.println("Enter a degree in Celsius: ");
        ce = input.nextDouble();
        fa= (9.0 / 5.0) * ce + 32;
        System.out.println(ce + " Celcias is "+ fa+ " Farenheit");
        input.close();
    }
}
