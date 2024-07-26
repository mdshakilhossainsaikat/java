class Teacher{
    private String name;
    private String gender;
    private int age;
    static String university = "East West University";

    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}

public class use_SetterGetter{
    public static void main(String[] args){
        Teacher object1 = new Teacher();
        Teacher object2 = new Teacher();

        object1.setName("Md Shakil Hossain Saikat");
        object1.setGender("Male");
        object1.setAge(24);

        object2.setName("Sadman Alif");
        object2.setGender("Male");
        object2.setAge(22);
        

        System.out.println("University\t: "+Teacher.university);
        System.out.println("Teacher\t\t: "+object1.getName());
        System.out.println("Gender\t\t: "+object1.getGender());
        System.out.println("Age\t\t: "+object1.getAge());

        System.out.println("\n");
        
        System.out.println("University\t: "+Teacher.university);
        System.out.println("Teacher\t\t: "+object2.getName());
        System.out.println("Gender\t\t: "+object2.getGender());
        System.out.println("Age\t\t: "+object2.getAge());
    }
}