class MyPoint 
{
    private double x;
    private double y;
    public MyPoint() 
    {
        this(0, 0);
    }
    public MyPoint(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    public double getX() 
    {
        return x;
    }
    public double getY() 
    {
        return y;
    }
    public double distance(MyPoint another) 
    {
        return Math.sqrt(Math.pow(another.getX() - x, 2) + Math.pow(another.getY() - y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
}
public class ass3_2
{
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("Distance between points: " + point1.distance(point2));
    }
}
