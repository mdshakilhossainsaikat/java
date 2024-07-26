
public class ass2_8 
{
    public static void main(String[] args) 
    {
        // Generate 100,000 random numbers
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        selectionSort(numbers);
        stopWatch.stop();
        System.out.println("Sorting 100,000 numbers using selection sort took " + stopWatch.getElapsedTime() + " milliseconds.");
    }
    public static void selectionSort(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            if (minIndex != i) 
            {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() 
    {
        startTime = System.currentTimeMillis();
    }
    public long getStartTime() 
    {
        return startTime;
    }
    public long getEndTime() 
    {
        return endTime;
    }
    public void start() 
    {
        startTime = System.currentTimeMillis();
    }
    public void stop() 
    {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() 
    {
        return endTime - startTime;
    }
}
