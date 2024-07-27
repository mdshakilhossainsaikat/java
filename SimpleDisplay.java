public class SimpleDisplay{
    public static void main(String[] args) {

        //Simple some printing 
        System.out.println("_________________________________________");
        System.out.println("No. 1\nWelcome to java.\nWelcome to computer Science.\nPrograming is fun.");

        // printing same line sevarel times using the 'for loop'
        System.out.println("_________________________________________");
        System.out.println("No. 2");
        for(int i = 0; i<5; i++){
            System.out.println(i+1 +". Wecome to java");
        }

        // printng a table using the 'for loop'
        System.out.println("_________________________________________");
        System.out.println("04.\na\ta^2\ta^3");
        for(int i= 1; i<=5; i++){
            System.out.println(i+"\t"+i*i+"\t"+i*i*i+"\n");
        }

        // sum of a series using loop 'for':'while'
        System.out.println("_________________________________________");
        System.out.println("06. sum of the serise:\nusing while loop");
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum +=i;
        }
        System.out.println("The some of serise from 1 to 10 is: "+sum);
    }
}