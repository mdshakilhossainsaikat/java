package com.valluk.again;
public abstract class Shape {
    double dim1;
    double dim2;
    
    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract void area();
    public abstract void perimeter();
}
