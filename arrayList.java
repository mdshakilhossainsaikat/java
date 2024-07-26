package com.valluk.again;
import java.util.ArrayList;
import java.util.Random;
public class arrayList {
    public static void main(String[]args){
        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.print("Enter number of numbers: ");
        int n = random.nextInt(10)+1;
        System.out.println(n);
        
        for(int i =0; i<n; i++){
            number.add(random.nextInt(10));
        }
        
        System.out.println(number);
        
        System.out.print("\nEnter a index number to eleminate the value: ");
        int m = random.nextInt(10);
        System.out.println(m);
        if(m<number.size()){
            number.remove(m);
            System.out.println(number);
        }
        else{
            System.out.println("Your entered elemination index is invalid.");
        }
        
        System.out.println("\nIs this list empty: "+number.isEmpty());
        int a = random.nextInt(10);
        System.out.println("\nDose this list contains "+a+": "+number.contains(a));
        if(number.contains(a)){
            int b =number.indexOf(a);
            System.out.println("The number "+a+" is the index: "+b);
            number.set(b, 100);
            System.out.println("After using set method the list is: "+number);
            System.out.println("After using set method we have: "+number.get(b));
        }
    }
}
