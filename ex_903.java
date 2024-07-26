import java.util.*;

class User{
    void time(long[] elapsedTime){
        for(long time : elapsedTime){
            Date date = new Date(time);
            System.out.println("Elapsed time\t: "+time+" milliseceonds");
            System.out.println("Date and time\t: "+date);
            System.out.println();
        }
    }
}
public class ex_903 {
    public static void main(String[]args){
        long[] elapsedTime = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};
        User user = new User();
        user.time(elapsedTime);
    }
}
