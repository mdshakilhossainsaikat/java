package com.valluk.again;
import java.util.Scanner;
public class stringbufferpelindrom {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter here: ");
        String s = scanner.nextLine();
        System.out.println("You entered: "+s);
        
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        
        if(s.equals(s1)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not a pelindom");
        }
    }
}
