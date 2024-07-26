// Times table from 2 to 10
//package com.valluk.again;
public class timeTable {
    public static void main(String[]args){
        
        for(int i=2; i<=10; i++){
            for(int j = 1; j<=10; j++){
                
                System.out.println(j+"\tx\t"+i+"\t=\t"+ i*j);
            }
            System.out.println("\n");
        }
    }
}
