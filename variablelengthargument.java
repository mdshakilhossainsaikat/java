package com.valluk.again;
public class variablelengthargument {
    public static void main(String[] args) {
        vla ob = new vla();
        
        ob.Sum(1,2,3);
        ob.Sum(1,2,3,4,5);
        ob.Sum(1,2,3,4,5,6,7);
    }
}

class vla{
    void Sum(int ... num){
        int sum = 0;
        for(int x: num){
            sum+=x;
        }
        System.out.println("The sum is:\t"+sum);
    }
}
