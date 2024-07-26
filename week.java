package com.valluk.again;
import java.util.Scanner;
public class week {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number for day: ");
        int n = scanner.nextInt();
        
        switch(n){
            case 1: System.out.println("The day is Satureday"); break;
            case 2: System.out.println("The day is Sunday"); break;
            case 3: System.out.println("The day is Monday"); break;
            case 4: System.out.println("The day is Tuseday"); break;
            case 5: System.out.println("The day is Wednesday"); break;
            case 6: System.out.println("The day is Thursday"); break;
            case 7: System.out.println("The day is Friday"); break;
            default: System.out.println("The number you entered is invalid.");
        }
    }
}
