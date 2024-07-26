package com.valluk.again;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int m =n;
        String str = Integer.toString(n);
        System.out.println("You entered: "+n);
        int sum = 0;
        System.out.println(str.length());
        for(int i=1; i<=str.length(); i++){
            int a = n%10;
            sum+=a;
            n = n/10;
        }
        System.out.println("The sum of "+m+" is: "+sum);
    }
}
