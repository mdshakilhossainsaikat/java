
package com.valluk.again;
import java.util.Scanner;
import java.util.Random;
public class arraysumavg {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();        
        int arr[] = new int [n];

        for (int i = 0; i<arr.length; i++){
            arr[i]= rand.nextInt(10);
        }
        Num(arr);
        Sum(arr);
        Max(arr);
        Min(arr);
        
    }
    public static void Max(int arr[]){
        int max= arr[0];
        for (int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum point is: "+max);
    }
    
    public static void Min(int arr[]){
        int min= arr[0];
        for (int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum point is: "+min);
    }
    
    public static void Sum(int arr[]){
        int sum =0;
        double avg = 0;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
            }
        avg = (sum*1.0)/arr.length;
        System.out.println("\nThe total sum is: "+sum);
        System.out.println("The avarage of the numbers is: "+avg);
        }
    
    public static void Num(int arr[]){
        System.out.print("The numbers are: ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            }
        }
    }

