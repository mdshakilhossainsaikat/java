//sum of odd numbers frooom m to n;
package com.valluk.again;
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (m, n) here: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sumAll = 0;
        int sumOdd=0;
        int sumEven =0;
        if (m>=n){
            System.out.println("Something went wrong!");
        }
        else{
            for(int i = m; i<=n ; i++){
            sumAll+=i;
            
            
                if(i%2!=0){
                    sumOdd += i;
                }
                
            
            
                if(i%2==0){
                    sumEven +=i;
                
                }
        }
                System.out.println("The sum of all numbers from "+m+" to "+n+" is "+sumAll);
                System.out.println("the sum jof Odd numbers from "+m+" to "+n+" is "+sumOdd);
                System.out.println("the sum of Even numbers from "+m+" to "+n+" is "+sumEven);
        }
    }
}
