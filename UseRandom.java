import java.util.Random;
import java.util.random.*;

public class UseRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(9)+1;

        System.out.println(a);
    }
}
