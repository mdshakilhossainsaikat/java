import java.util.Scanner;
public class vol_of_cyl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad,hig, vol, area;
        final double PI = 3.1416;
        System.out.print("Enter the radius and length of a cylinder: ");
        rad = input.nextDouble();
        hig = input.nextDouble();
        area = rad * rad * PI;
        vol = area * hig;
        System.out.println("The volume is = "+ vol);
        System.out.println("The area is = "+ area);
        input.close();
    }

}
