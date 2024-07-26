package com.valluk.again;
import java.util.Scanner;
public class fibunacci {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range you want: ");
        int n= scanner.nextInt();
        int st = 0;
        int nd = 1;
        int sum = 0;
        int tamp = 0;
        System.out.print("The fibunacci serise of "+n+" numbers is: 0 1 ");
        for(int i= 1; i<=n; i++){
            sum = st+nd;
            System.out.print(sum+" ");
            st = nd;
            nd = sum;
        }
    }
}
