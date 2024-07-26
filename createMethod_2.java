/*In this program:
    1. create a custom class name "Teacher";
    2. create a data field in custom class;
    3. create two objects in main program to use the custom class in main program;
    4. create a parameterless method name "Info" in the custom class to print the informations;
    5. create a parameterized method name "show" in the custom class to put informations;
 */
public class createMethod_2
{
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher();
        teacher1.Info("Md Shakil Hossain Saikat", "Male", 24);

        Teacher teacher2 = new Teacher();
        teacher2.Info("Sadman Alif", "Male", 22);
        
        teacher1.show();
        teacher2.show();
    }
}
class Teacher
{
    private String name;
    private String gender;
    private int age;

    public void Info(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void show()
    {
        System.out.println("Name of teacher: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("\n");
    }
}
