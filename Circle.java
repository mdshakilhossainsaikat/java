package com.valluk.again;
public class Circle extends Shape{
    public Circle(double r){
        super(r, r);
    }

    @Override
    public void area() {
        double cal1= Math.PI*Math.pow(dim1, 2);
        System.out.println("The area of the circle is:\t\t\t"+cal1);
        
    }

    @Override
    public void perimeter() {
        double cal2 = 2*Math.PI*dim1;
        System.out.println("The perimeter of the circle is:\t\t\t"+cal2);
    }
}
