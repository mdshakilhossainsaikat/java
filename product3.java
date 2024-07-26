import java.util.Scanner;
public class product3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        //id, title, price, description, category

        int id, price;
        String title, des, cat;

        System.out.println("Enter your id");
        id = i.nextInt();
        System.out.println("Enter the title");
        title = i.next();
        System.out.println("Enter the price");
        price = i.nextInt();
        i.nextLine();
        System.out.print("Enter the description");
        des = i.nextLine();
        System.out.println("Enter the catagory");
        cat = i.next();

        System.out.printf("Id: %d\nTitle: %s\nPrice: %d\nDescription: %s\nCatagory: %s", id,title,price,des,cat);
        i.close();
    }
}
