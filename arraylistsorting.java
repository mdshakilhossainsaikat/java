package com.valluk.again;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class arraylistsorting {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random ();
        
        System.out.print("Enter the size of list: ");
        int n = rand.nextInt(16)+5;
        System.out.println(n);
        
        System.out.print("\nYour list is: ");
        for(int i = 0; i<n;i++){
            list.add(rand.nextInt()%20);
        }
        System.out.println(list);
        System.out.println("This list is unsorted.");
        
        Collections.sort(list);
        System.out.println("\nYour list sorted in accending order is: "+list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nYour list sorted in decending order is: "+list);
    }
}
