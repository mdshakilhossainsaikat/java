import java.util.*;

public class ass2_7 {
    public static void main(String[] args) 
    {
        System.out.println("Current date:");
        displayCurrentDate();
        System.out.println("\nDate for elapsed time since January 1, 1970:");
        displayDateForElapsedTime(1234567898765L);
    }
    public static void displayCurrentDate() 
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day\tMonth\tYear");
        System.out.println(day+"\t"+month+"\t"+year);        
    }
    public static void displayDateForElapsedTime(long elapsedTime) 
    {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day\tMonth\tYear");
        System.out.println(day+"\t"+month+"\t"+year);
    }
}