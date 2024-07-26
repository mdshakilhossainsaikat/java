package com.valluk.again;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class arraySorting {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter how many number do you want: ");
        int n = scanner.nextInt();
        int nums[]= new int[n];
        System.out.print("\nUnsorted numbers are: ");
        for(int i = 0; i<n; i++){
            nums[i]= random.nextInt()%10;
            System.out.print(nums[i]+" ");
        }
        Arrays.sort(nums);
        System.out.print("\nSorted in Assending order: ");
        for(int i =0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("\nSorted in Decendig order: ");
        for(int i =n-1; i>=0; i--){
            System.out.print(nums[i]+" ");
        }
    }
}
