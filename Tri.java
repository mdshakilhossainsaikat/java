package com.valluk.again;
public class Tri extends Shape {
    public Tri(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public void area() {
        double cal1=.5*dim1*dim2;
        System.out.println("The area of the triangle is:\t\t\t"+cal1);
        
    }

    @Override
    public void perimeter() {
        double cal2 = dim1+dim2+(Math.sqrt((Math.pow(dim1, 2))+(Math.pow(dim2, 2))));
        System.out.println("The perimeter of the triangle is:\t\t"+cal2);
    }
}
