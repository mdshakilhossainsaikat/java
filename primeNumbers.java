package com.valluk.again;
import java.util.Scanner;
public class primeNumbers{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count=0;
        int i,j;
        System.out.print("The prime numbers from 1 to "+n+" are: ");
        for( i =1; i<=n; i++){
            for( j = 2; j<i/2; j++){
                if(i%j==0){
                    count++;  
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
           
            count = 0;
        }
    }
}