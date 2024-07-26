package com.valluk.again;
public class recursion {
    public static void main(String[] args) {
        R ob = new R();
       int a = ob.fact(5);
        System.out.println("Fectorial of 5 is:\t"+a);
        
    }
}
class R{
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
