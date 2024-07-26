public class ass_12 {
    public static void main(String[] args) 
    {
        for(double value =10000.0; value <=100000; value+=10000)
        {
            double e = 1.0; 
            for(double i=1; i<= value; i++)
            {
                double den =i;
                for (double k = i-1; k>= 1; k--)
                {
                    den*=k;
                }
                e+=1/den;
            }
            System.out.println("The e value fo i = "+value+": "+e);
        }
    }
}
