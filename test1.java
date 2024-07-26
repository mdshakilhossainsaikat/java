package com.valluk.again;
import java.util.Date;
public class test1 {
    public static void main(String[] args) {
        Date date  = new Date();
        
        Shape ob1 =new Rc(5,10);
        Shape ob2 = new Tri(5,10);
        Shape ob3 = new Circle(5);
        
        ob1.area();
        ob1.perimeter();
        ob2.area();
        ob2.perimeter();
        ob3.area();
        ob3.perimeter();
        
        
        
        
        
        System.out.println(date);
        
        
    }
}
