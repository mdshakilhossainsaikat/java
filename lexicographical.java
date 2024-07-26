package com.valluk.again;
import java.util.Scanner;
public class lexicographical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if(a.compareToIgnoreCase(b)<0){
            System.out.println("-1");
        }else if(a.compareToIgnoreCase(b)>0){
            System.out.println("1");
        }else if(a.compareToIgnoreCase(b)==0){
            System.out.println("0");
        }
    }
}
