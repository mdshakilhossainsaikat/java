/*In this program:
    1. create a custom class name "Teacher";
    2. create a data field in custom class;
    3. create two objects in main program to use the custom class in main program;
    4. create a parameterless method name "Info" in the custom class to print the informations;
 */
class Teacher
{
    String name;
    String gender;
    int age;

    public void info()
    {
        System.out.println("Name of teacher: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("\n");
    }
}
public class createMethod
{
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher();

        teacher1.name = "Md Shakil Hossain Saikat";
        teacher1.gender = "Male";
        teacher1.age = 24;

        Teacher teacher2 = new Teacher();

        teacher2.name = "Sadman Alif";
        teacher2.gender = "Male";
        teacher2.age = 22;

        teacher1.info();
        teacher2.info();
    }
}