package com.valluk.again;
public class Student {
    private static int count =0;
    private String name;
    private static String gender = "Male";
    private int age;
    private int id;
    private static String uniName = "East West University";
    
    public Student(){
        System.out.println("Error!");
    }
    
    
    
    public Student(String name, int age, int id){
        count++;
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void showInfo(){
            System.out.println("Name:\t\t"+name);
            System.out.println("Id:\t\t"+id);
            System.out.println("Age:\t\t"+age);
            System.out.println("Gender:\t\t"+gender);
            System.out.println("University:\t"+uniName);
            System.out.println("Total student: "+count);
            System.out.println("\n");
            
    }
    
}
