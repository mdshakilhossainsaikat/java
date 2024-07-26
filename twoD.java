package com.valluk.again;
import java.util.Random;
public class twoD {
    public static void main(String[]args){
        Random random = new Random();
       
        int row = random.nextInt(10)+1;
        int colomn = random.nextInt(10)+1;
        System.out.println("Row number: "+row);
        System.out.println("Colomn number: "+colomn);
        
        int D[][] = new int[row][colomn];
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<colomn; j++){
                D[i][j]=random.nextInt(10);
            }
        }
        MatirxD(D);
    }
    
    public static void MatirxD(int D[][]){
        for(int i = 0; i<D.length; i++){
            for(int j = 0; j<D[i].length; j++){
                System.out.print(D[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
