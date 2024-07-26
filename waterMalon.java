package com.valluk.again;
import java.util.Scanner;
/**
 *
 * @author Mohammad Saikat
 */
public class waterMalon {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if(w==2){
            System.out.println("NO");
        }
        else if(w%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
