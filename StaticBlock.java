package com.valluk.again;

    
public class StaticBlock {
    static int id;
    static String name;
    
    static {
        id = 101;
        name = "saikat";
    }
    
    static void display() {
        System.out.println("Name:\t" + name + "\nId:\t" + id);
    }
    
    public static void main(String[] args) {
        StaticBlock.display();
    }

}
