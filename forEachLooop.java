package com.valluk.again;
import java.util.Scanner;
import java.util.Random;
public class forEachLooop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter how many you want: ");
        int n = scanner.nextInt();
        
        int array[] = new int[n];
        
        for(int i = 0; i<n; i++){
            array[i] = random.nextInt(10);
        }
        Numbers(array);
        Sum(array);
        Maximum(array);
        Minimum(array);
    }
    
    public static void Numbers(int array[]){
        System.out.print("The numbers we have got: ");
        for(int i: array){
            System.out.print(i+" ");
        }
    }
    
    public static void Sum(int array[]){
        int sum = 0;
        double avg = 0;
        for(int i: array){
            sum +=i;
        }
        avg = (sum*1.0)/array.length;
        System.out.println("\nThe sum of the numbers is: "+sum);
        System.out.println("The avarage of the numbers is: "+avg);
    }
    
    public static void Maximum(int array[]){
        int max = array[0];
        for(int i:array){
            if(max<i){
                max = i;
            }
        }
        System.out.println("The maximum point is: "+max);
    }
    
    public static void Minimum(int array[]){
        int min = array[0];
        for(int i: array){
            if(min > i){
                min=i;
            }
        }
        System.out.println("The minimum point is: "+min);
    }
}

