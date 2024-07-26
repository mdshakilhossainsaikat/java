package com.valluk.again;
public class Teacher extends Person {
    
    private String subject;
    private int tid;
    Teacher(String name, int age, String gender, int nid, String subject,int tid){
        super(name,age,gender,nid);
        this.subject = subject;
        this.tid = tid;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Subject:\t"+subject);
        System.out.println("Teacher's ID:\t"+tid);
        System.out.println("\n");
    }
}
