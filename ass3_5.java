class Circle2D 
{
    private double x;
    private double y;
    private double radius;
    public Circle2D() 
    {
        this(0, 0, 1);
    }
    public Circle2D(double x, double y, double radius) 
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX() 
    {
        return x;
    }
    public double getY() 
    {
        return y;
    }
    public double getRadius() 
    {
        return radius;
    }
    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) 
    {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }
    public boolean contains(Circle2D circle) 
    {
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        return distanceBetweenCenters + circle.getRadius() <= radius;
    }
    public boolean overlaps(Circle2D circle) 
    {
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        return distanceBetweenCenters < radius + circle.getRadius();
    }
}
public class ass3_5 
{
    public static void main(String[] args) 
    {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
