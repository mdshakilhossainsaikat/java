package com.valluk.again;
import java.util.Scanner;
public class CatchACoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[]= new int[n];
        int brr[]=new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i]= scanner.nextInt();
            brr[i]= scanner.nextInt();
            
            if(brr[i]>=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
