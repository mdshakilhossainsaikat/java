import java.util.*;
public class ex_910 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values A, B, C");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        QuadraticEquation equation = new QuadraticEquation( a, b, c);

        if(equation.getDiscriminant()>0){
            System.out.println("Root 1\t: "+equation.getRoot1()+"\nRoot 2\t: "+equation.getRoot2());
        }
        else if(equation.getDiscriminant()==0){
            System.out.println("Root 1\\t: "+equation.getRoot1());
        }
        else if(equation.getDiscriminant()<0){
            System.out.println("The equation has no roots.");
        }

        input.close();
    }
}
class QuadraticEquation{
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(){
        this.a = a;
    }
    public void setB(){
        this.b = b;
    }
    public void setC(){
        this.c = c;
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

    public int getDiscriminant(){
        return (b*b)-4*a*c;
    }

    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/2*a;
    }
}