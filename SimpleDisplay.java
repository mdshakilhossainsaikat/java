import java.util.Random;

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
            System.out.print(i);
            if(i==10){
                break;
            }
            System.out.print(" + ");
        }
        System.out.println(" = "+sum);
        
        //taking input using random method
        System.out.println("_________________________________________");
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);
        int d = random.nextInt(10);
        int e = random.nextInt(10);
        int f = random.nextInt(10);
        int x = (e*d-e*c)/(a*d-b*c);
        int y = (a*f-e*c)/(a*d-b*c);
        if((e*d-e*c)==0 || (a*d-b*c)==0 ||(a*f-e*c)==0 || (a*d-b*c)==0){
            System.out.println("Math error!");
        }else{
            System.out.println("No. 13\nX: "+x+"\nY: "+y);
        }
        

        // ditermine the avarage speed
        System.out.println("No. 12");
        System.out.println("_________________________________________");
        Random random2 = new Random();
        System.out.print("Runner's distance(in miles): ");
        int distance = random2.nextInt(100);
        System.out.println(distance);
        System.out.print("Estimated time: ");
        int hour = random2.nextInt(24);
        int minute = random2.nextInt(60);
        int second = random2.nextInt(60);
        System.out.println(hour+"h "+minute+"m "+second+"s");
        double kilo = distance*1.6;
        double m = (second/60)+minute;
        double time = (m/60)+hour;
        double speed = kilo/time;
        System.out.println("The avarage speed is: "+speed);

        // one birth per second, population in next 5 years
        System.out.println("No. 11");
        System.out.println("_________________________________________");
        int currentPopulation = 312032486;
        int birthRate = 7;
        int deathRate = 13;
        int immigrantRate = 45;
        int secondInYear = 60*60*24*365;

        int birthPerYear = secondInYear/birthRate;
        int deathPerYear = secondInYear/deathRate;
        int immigrationPerYear = secondInYear/immigrantRate;

        for(int year =1; year<=5; year++){
            currentPopulation += birthPerYear- deathPerYear + immigrationPerYear;
            System.out.println("After "+year+" year population will: "+currentPopulation);
        }

        
        System.out.println("_________________________________________");

    }
}