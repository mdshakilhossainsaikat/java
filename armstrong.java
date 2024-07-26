
package com.valluk.again;
import java.util.Scanner;

public class armstrong {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("\nYour entered number is: "+n);
        String str = Integer.toString(n);
        int m = n;
        int arms =0;
        for(int i = 1; i<=str.length(); i++){
            int a = n%10;
            arms = arms+(a*a*a);
            n=n/10;
        }
        //System.out.println("arms is: "+arms);
        if(arms ==m){
            System.out.println(m+" is an armstrong number.");
        }
        else{
            System.out.println(m+" is not an armstrong nunber.");
        }
    }
}
