package com.valluk.again;

class Box {
    private double height;
    private double width;
    private double depth;
    
    public Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    public void displayVol(){
        System.out.println(height*width*depth);
    }
}

public class BoxVolume{
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(20,30,10);
        
        System.out.print("Volume of box 1 is:\t");
        box1.displayVol();
        System.out.print("\nVolume of box 2 is:\t");
        box2.displayVol();
    }
}