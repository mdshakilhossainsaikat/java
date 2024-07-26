import java.util.Scanner;
public class ex_305 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int thatday = input.nextInt();
        int result = (thatday%7)+today;
        switch (today) {
            case 1: switch (result) {
                case 1: System.out.println("Today is Saturday and the future day is Saturday");break;
                case 2: System.out.println("Today is Saturday and the future day is Sunday");break;
                case 3: System.out.println("Today is Saturday and the future day is Monday");break;
                case 4: System.out.println("Today is Saturday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Saturday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Saturday and the future day is Thursday");break;
                case 7: System.out.println("Today is Saturday and the future day is Friday");break;
            }break;
            case 2: switch (result) {
                case 1: System.out.println("Today is Sunday and the future day is Saturday");break;
                case 2: System.out.println("Today is Sunday and the future day is Sunday");break;
                case 3: System.out.println("Today is Sunday and the future day is Monday");break;
                case 4: System.out.println("Today is Sunday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Sunday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Sunday and the future day is Thursday");break;
                case 7: System.out.println("Today is Sunday and the future day is Friday");break;
            }break;
            case 3: switch (result) {
                case 1: System.out.println("Today is Monday and the future day is Saturday");break;
                case 2: System.out.println("Today is Monday and the future day is Sunday");break;
                case 3: System.out.println("Today is Monday and the future day is Monday");break;
                case 4: System.out.println("Today is Monday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Monday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Monday and the future day is Thursday");break;
                case 7: System.out.println("Today is Monday and the future day is Friday");break;
            }break;
            case 4: switch (result) {
                case 1: System.out.println("Today is Tuesday and the future day is Saturday");break;
                case 2: System.out.println("Today is Tuesday and the future day is Sunday");break;
                case 3: System.out.println("Today is Tuesday and the future day is Monday");break;
                case 4: System.out.println("Today is Tuesday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Tuesday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Tuesday and the future day is Thursday");break;
                case 7: System.out.println("Today is Tuesday and the future day is Friday");break;
            }break;
            case 5: switch (result) {
                case 1: System.out.println("Today is Wednesday and the future day is Saturday");break;
                case 2: System.out.println("Today is Wednesday and the future day is Sunday");break;
                case 3: System.out.println("Today is Wednesday and the future day is Monday");break;
                case 4: System.out.println("Today is Wednesday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Wednesday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Wednesday and the future day is Thursday");break;
                case 7: System.out.println("Today is Wednesday and the future day is Friday");break;
            }break;
            case 6: switch (result) {
                case 1: System.out.println("Today is Thursday and the future day is Saturday");break;
                case 2: System.out.println("Today is Thursday and the future day is Sunday");break;
                case 3: System.out.println("Today is Thursday and the future day is Monday");break;
                case 4: System.out.println("Today is Thursday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Thursday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Thursday and the future day is Thursday");break;
                case 7: System.out.println("Today is Thursday and the future day is Friday");break;
            }break;
            case 7: switch (result) {
                case 1: System.out.println("Today is Friday and the future day is Saturday");break;
                case 2: System.out.println("Today is Friday and the future day is Sunday");break;
                case 3: System.out.println("Today is Friday and the future day is Monday");break;
                case 4: System.out.println("Today is Friday and the future day is Tuesday");break;
                case 5: System.out.println("Today is Friday and the future day is Wednesday");break;
                case 6: System.out.println("Today is Friday and the future day is Thursday");break;
                case 7: System.out.println("Today is Friday and the future day is Friday");break;
            }break;
        }
        input.close();
    }
}
