package com.valluk.again;
public class Rc extends Shape {
    
    public Rc(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public void area() {
        double cal1=dim1*dim2;
        System.out.println("The area of the rectengle is:\t\t\t"+cal1);
        
    }

    @Override
    public void perimeter() {
        double cal2 = 2*(dim1+dim2);
        System.out.println("The perimeter of the rectengle is:\t\t"+cal2);
    }
    
}
