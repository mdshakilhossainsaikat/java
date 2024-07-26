
package com.valluk.again;
import java.util.Scanner;

public class pelindrom2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range of pelindrom: ");
        int n = scanner.nextInt();
        
        int count=0;
        System.out.print("The pelindrom numbers from 1 to "+n+" are: ");
        for(int i = 1; i<=n; i++){
            int rev = 0;
            String str = Integer.toString(i);
            if(str.length()>=2){
                int k = i;
                for(int j = 1; j<=str.length(); j++){
                    int a = k%10;
                    rev = (rev*10)+a;
                    k = k/10;
                }
                if(rev==i){
                    count++;
                    System.out.print(i +"\t");
                }
            }
        }
        System.out.println("\nThere are "+count+" pelindrom numbers from 1 to "+n);
    }
}
