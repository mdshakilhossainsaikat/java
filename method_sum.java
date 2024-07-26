public class method_sum {
    public static void main(String[] args)
    {
        System.out.println(sum(1,10));
        System.out.println(sum(10,20));
        System.out.println(sum(30,40));
    }

    public static int sum (int i1, int i2)
    {
        int r=0;
        for(int i = i1; i<=i2; i++)
        {
            r+=i;
        }
        return r;
    }
}
