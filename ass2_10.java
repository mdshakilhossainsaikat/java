import java.util.*;
public class ass2_10 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row and coloumn: ");
        int row = input.nextInt();
        int col = input.nextInt();
        System.out.println("Enter the values.");
        double tda[][] = new double[row][col]; 
        for(int i = 0 ; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                tda[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargest(tda);
        System.out.println("The location of the largest element is at (" +
                location.row + ", " + location.column + ")");
        System.out.println("The largest element is: " + location.maxValue);
    }
}
class Location 
{
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) 
    {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) 
    {
        int row = 0;
        int column = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if (a[i][j] > maxValue) 
                {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row, column, maxValue);
    }
}
