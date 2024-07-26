package com.valluk.again;
import java.util.Scanner;
public class Scorrer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            int teamAIN= scanner.nextInt();
            int teamBIN = scanner.nextInt();
            
            int teamAF = scanner.nextInt();
            int teamBF= scanner.nextInt();
            
            if(teamAIN<teamAF && teamBF!=0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
