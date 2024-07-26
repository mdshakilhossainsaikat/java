import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Permutation {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your code is runnig");
        int n = random.nextInt(9)+1;
        for (int x = 1; x <= n; x++) {
            int m = random.nextInt(9)+1;;
            int[] list = new int[m];  // Fixed array initialization
            for (int i = 0; i < m; i++) {
                list[i] = random.nextInt(9)+1;;
            }
            cal(list);
        }
        scanner.close();
        System.out.println("your code is finished");
    }
    
    public static void cal(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {  
                if ((list[i] * list[j]) % ((i + 1) * (j + 1)) == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
