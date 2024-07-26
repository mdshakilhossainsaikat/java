class Teacher{
    private String name;
    private String gender;
    private int age;

    public Teacher(){
        System.out.println("Teacher list:\n\n");
    }

    public Teacher(String name){
        this.name = name;
    }

    public Teacher (String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Teacher (String name, String gender, int age){
        this.name = name;
        this.gender= gender;
        this.age = age;
    }

    public void show(){
        System.out.println("Teacher\t: "+name+"\nGender\t: "+gender+"\nAge\t: "+age+"\n\n");
    }
    
}
public class constructorOverloding {
    public static void main(String[]args){
        Teacher teacherlist = new Teacher();
        Teacher teacher1 = new Teacher("Md Shakil Hossain Saikat");
        Teacher teacher2 = new Teacher("Sadman Alif", 22);
        Teacher teacher3 = new Teacher("Noor E Alam", "Male");
        Teacher teacher4 = new Teacher("Mohammad Omar", "Male", 22);

        teacher1.show();
        teacher2.show();
        teacher3.show();
        teacher4.show();
    }
}


/*
output:

Teacher list:


Teacher : Md Shakil Hossain Saikat
Gender  : null
Age     : 0


Teacher : Sadman Alif
Gender  : null
Age     : 22


Teacher : Noor E Alam
Gender  : Male
Age     : 0


Teacher : Mohammad Omar
Gender  : Male
Age     : 22
 */