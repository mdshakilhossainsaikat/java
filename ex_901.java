class Rectangle{
    private double height;
    private double wight;

    public Rectangle(){
        height = 1;
        wight = 1;
    }
    public Rectangle(double height, double wight){
        this.height = height;
        this.wight = wight;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double wight){
        this.wight  = wight;
    }

    public double getArea(){
        return height*wight;
    }
    public double getPerimeter(){
        return 2*(height+wight);
    }

}
public class ex_901 {
    public static void main(String [] args){
        Rectangle object1 = new Rectangle();
        Rectangle object2 = new Rectangle();

        object1.setHeight(40.0);
        object1.setWeight(4.0);
        object2.setHeight(35.5);
        object2.setWeight(3.5);

        System.out.println("Height\t: 40.0\nWeight\t: 4.0");
        System.out.println("Area\t: "+object1.getArea());
        System.out.println("Peri\t: "+object1.getPerimeter());
        System.out.println("\n");
        System.out.println("Height\t: 35.5\nWeight\t: 3.5");
        System.out.println("Area\t: "+object2.getArea());
        System.out.println("Peri\t: "+object2.getPerimeter());
    }
}
