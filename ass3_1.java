
class Time
{
    private int hour;
    private int minute;
    private int second;
    public Time()
    {
        long ms = System.currentTimeMillis();
        convert(ms);
    }
    public Time (long elapsedTime)
    {
        setTime(elapsedTime);
    }
    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    public void setTime(long elapsedTime)
    {
        convert(elapsedTime);
    }
    private void convert(long ms)
    {
        long ts = ms / 1000;
        second = (int)(ms % 60);
        long tm = ts / 60;
        minute = (int)(tm % 60);
        long th = tm / 60;
        hour = (int)(th % 24);
    }
}
public class ass3_1 
{
    public static void main(String[]args)
    {
        Time user = new Time();
        Time cuser = new Time(555550000);
        System.out.println("\t\tHour\tMinute\tSecond");
        System.out.println("Current time:\t"+user.getHour()+"\t"+user.getMinute()+"\t"+user.getSecond());
        System.out.println("Elapsed time:\t"+cuser.getHour()+"\t"+cuser.getMinute()+"\t"+cuser.getSecond());
    }
}
