/*In this program:
    1. create a custom class name "Teacher";
    2. create a data field in custom class;
 */
class Teacher
{
    String name;
    String gender;
    int age;
}
public class createClass
{
    public static void main(String[] args)
    {
        Teacher teacher1 = new Teacher();

        teacher1.name = "Md Shakil Hossain Saikat";
        teacher1.gender = "Male";
        teacher1.age = 24;

        System.out.println(teacher1.name+teacher1.gender+teacher1.age);
    }
}