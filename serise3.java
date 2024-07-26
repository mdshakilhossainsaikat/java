package com.valluk.again;
import java.util.Scanner;
public class serise3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 1;
        for(int i =1 ; i<=n; i++){
            
            sum*=i;
        }
        System.out.println("Sum: "+sum);
    }
}
