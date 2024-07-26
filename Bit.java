package com.valluk.again;
import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i  =0; i<n; i++){
            String input = scanner.nextLine();
            if(input.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
