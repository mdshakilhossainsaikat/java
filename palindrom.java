package com.valluk.again;
import java.util.Scanner;

public class palindrom {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int m =n;
        String str = Integer.toString(n);
        
        int rev = 0;
        for(int i = 1; i<=str.length(); i++){
            int a = n%10;
            rev = rev*10+a;
            n = n/10;
        }
        System.out.println("the reversered number is: "+rev);
        if(rev ==m){
            System.out.println("the number "+m+" is a pelindrom number.");
        }
        else{
            System.out.println("the number "+m+" is not a pelindrom number.");
        }
    }
}
