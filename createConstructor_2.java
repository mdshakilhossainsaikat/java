/*In this program:
    1. create a custom class name "Teacher";
    2. create a data field in custom class;
    3. create two objects in main program to use the custom class in main program;
    4. create a parameterized constructor;
    5. create a parameterless constructor;
    5. create a parameterized method name "show" in the custom class to put informations;
*/

class Teacher{
    private String name;
    private String gender;
    private int age;

    public Teacher(){
        System.out.println("List of teacher:");
    }

    public Teacher(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void show(){
        System.out.println("Teacher\t: "+name+"\nGender\t: "+gender+"\nAge\t: "+age+"\n\n");
    }
}

public class createConstructor_2 {
    public static void main(String[] args){
     
        Teacher teacher1 = new Teacher("Md Shakil Hossain Saikat","Male", 24);
        Teacher teacher2 = new Teacher("Sadman Alif", "Male", 22);

        Teacher teacherlist = new Teacher();
        teacher1.show();
        teacher2.show();
    }
}
