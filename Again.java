//package com.valluk.again;
import java.util.Scanner;
public class Again{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of sum: ");
        int m = input.nextInt();
        int n = input.nextInt();
        
        if (m>=n){
            System.out.println("Something went wrong!");
        }
        else{
            int sum=0;
        for(int i = m; i<=n ; i++){
            sum+=i;
        }
        System.out.println("The sum from "+m+" to "+n+" is "+sum);
        }
    }
}