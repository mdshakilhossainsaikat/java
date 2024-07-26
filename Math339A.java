package com.valluk.again;
import java.util.Arrays;
import java.util.Scanner;
public class Math339A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String in = input.replace("+", "");
        
        char arr[]=in.toCharArray();
        Arrays.parallelSort(arr);
        int tem = arr[0];
        for(int i=0; i<in.length(); i++){
            
            if(arr[i]>tem){
                tem = arr[i];
                System.out.println(tem+"+");
            }
            
        }

        
    }
}
