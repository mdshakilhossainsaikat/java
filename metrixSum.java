package com.valluk.again;
import java.util.Scanner;
import java.util.Random;
public class metrixSum {
    public static void main(String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The the value of raw and colomn for D1 metrix: ");
        int row1 = scanner.nextInt();
        int colomn1 = scanner.nextInt();
        System.out.println("Enter the values of raw and colomn for D2 metrix:");
        int row2 = scanner.nextInt();
        int colomn2 = scanner.nextInt();
        scanner.close();
                /*
        int row1 = random.nextInt(4)+2;
        int colomn1 = random.nextInt(4)+2;
        int row2 =row1;
        int colomn2 = colomn1;
                */
        
        
        System.out.println("The numbers of row and colomn of metrixs D1\tRow: "+row1+"\tColomn: "+colomn1);
        System.out.println("The numbers of row and colomn of metrixs D2\tRow: "+row2+"\tColomn: "+colomn2);
        
        int D1[][] = new int[row1][colomn1];
        int D2[][]= new int [row2][colomn2];
        
        
        if(isSumable(row1, row2, colomn1, colomn2)){
            for(int i = 0; i<row1; i++){
                for(int j = 0; j<colomn1; j++){
                    D1[i][j]=random.nextInt(10);
                    D2[i][j]=random.nextInt(10);
                }
            }
             int row3 =row1;
             int colomn3 = colomn1;
             int D3[][]= new int [row3][colomn3];
            D3 = Sum(D1, D2);
            System.out.println("The D1 metrix is:");
            showD(D1);
            System.out.println("The D2 metrix is:");
            showD(D2);
            System.out.println("\nThe sum of the D1 & D2 metrix is D3");
            showD(D3);
            System.out.println("\nThe D1 metrix:");
            Dag(D1);
            System.out.println("\nThe D2 metrix:");
            Dag(D2);
            System.out.println("\nThe D3 metrix:");
            Dag(D3);
        }
        else{
            System.out.println("The metrix you gave are not sumable.");
        }
    }
    
    public static boolean isSumable(int row1, int row2, int colomn1, int colomn2){
        return row1 == row2 && colomn1 == colomn2;
    }
    
    public static int[][] Sum(int D1[][], int D2[][]){
        int row3 =D1.length;
        int colomn3 = D1[0].length;
        System.out.println("The numbers of row and colomn of metrixs D3\tRow: "+row3+"\tColomn: "+colomn3);
        int D3[][]= new int [row3][colomn3];
        
        for(int i = 0; i<D1.length;i++){
            for(int j =0; j< D1[i].length; j++){
                D3[i][j]= D1[i][j]+D2[i][j];
            }
        }
        return D3;
    }
    
    public static void showD(int D3[][]){
         for(int i = 0; i<D3.length;i++){
            for(int j =0; j< D3[i].length; j++){
                System.out.print(D3[i][j]+"\t");
            }
             System.out.println("\n");
        }
    }
    
    public static void Dag( int D1[][]){
        int diag =0;
        int upper = 0;
        int lower = 0;
         for(int i = 0; i<D1.length;i++){
            for(int j =0; j< D1[i].length; j++){
                if(i==j){
                    diag += D1[i][j];
                }
            }
        }
         
         for(int i = 0; i<D1.length;i++){
            for(int j =0; j< D1[i].length; j++){
                if(i<j){
                    upper += D1[i][j];
                }
            }
        }
         
         for(int i = 0; i<D1.length;i++){
            for(int j =0; j< D1[i].length; j++){
                if(i>j){
                    lower += D1[i][j];
                }
            }
        }
         System.out.println("The sum of the diagonal is: "+diag);
         System.out.println("The sum of the upper triangle is: "+upper);
         System.out.println("The sum of the lower triangle is: "+lower);
    }
}
