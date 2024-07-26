import java.util.*;
public class ex_911 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the values of A, B, C, D, E, F");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        LinearEquation equation= new LinearEquation(a,b,c,d,e,f);

        if(!equation.isSolvable()){
            System.out.println("The equation has no solution.");
        }
        else{
            System.out.println("Value of X\t: "+equation.getX());
            System.out.println("Value of Y\t: "+equation.getY());
        }
    }
}

class LinearEquation{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }
    public int getE(){
        return e;
    }
    public int getF(){
        return f;
    }
    
    public boolean isSolvable(){
        return (a*d - b*c)!=0;
    }

    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}