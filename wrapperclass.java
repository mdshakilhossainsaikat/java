package com.valluk.again;

public class wrapperclass {
    public static void main(String[] args) {
        int number1  = 10;
        System.out.println("Number 1: "+number1);
        
        Integer number2 = number1;
        System.out.println("Number 2: "+number2);
        
        int number3 = number2;
        System.out.println("Number 3: "+ number3);
        
        String s = Integer.toString(number1);
        System.out.println("S: "+s);
        
        int i = Integer.parseInt(s);
        System.out.println("Integer i: "+i);
        
        int j = Integer.valueOf(s);
        System.out.println("Integer j: "+j);
        
        
    }
}
