package com.valluk.again;
import java.util.Scanner;

public class reverseInteger {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);
        int m= n;
        int sum =0;
        System.out.print("The reversed number of "+m+" is: ");
        for(int i =1; i<=str.length(); i++){
            int a = n%10;
            sum = sum*10+a;
            System.out.print(a);
            n = n/10;
        }
        System.out.println("\nsum is: "+sum);
    }
}
