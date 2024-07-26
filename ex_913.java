import java.util.*;
public class ex_913 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row number: ");
        int nRow = input.nextInt();

        System.out.print("Enter colomn number: ");
        int nColomn = input.nextInt();



        Location location = new Location(nRow, nColomn);

        
        
        double[][] value = location.userInput(nRow, nColomn);
        location.locateLargest(value);
        
    }
}

class Location{

    public int nRow;
    public int nColomn;
    public double maxValue;

    public Location(int nRow, int nColomn){
        this.nRow = nRow;
        this.nColomn = nColomn;
    }

    Scanner input = new Scanner(System.in);
    public double[][] userInput(int nRow, int nColomn){
        double[][] value = new double[nRow][nColomn];
        for(int i = 0; i<value.length; i++){
            for(int j = 0; j< value.length; j++){
                value[i][j]=input.nextDouble();
            }
        }
        return value;
    }
    
    public static void locateLargest(double[][] value){

        int maxRow = 0;
        int maxColomn = 0;
        double maxValue = value[0][0];
        for(int i = 0; i<value.length; i++){
            for(int j = 0; j<value.length; j++){
                if(maxValue<value[i][j]){
                    maxValue = value[i][j];
                    maxRow = i+1;
                    maxColomn = j+1;
                }
            }
        }
        System.out.println("The largest value is "+ maxValue+ " at ("+ maxRow+", "+maxColomn+")");
        
    }

}
