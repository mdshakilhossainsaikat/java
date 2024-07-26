package com.valluk.again;
import java.util.Scanner;
import java.io.File;
public class fileclass {
    public static void main(String[] args) {
        
        File dir = new File("E:/Person");
        boolean isCreated = dir.mkdir();
        if(isCreated){
            System.out.println("Folder is created successfully!");
        }else{
            System.out.println("ERROR! Folder not created!");
        }
        String folderPath = dir.getAbsolutePath();
        System.out.println("Folder path: "+folderPath);
        System.out.println("Folder name: "+dir.getName());
        
        File file1 = new File(folderPath+"/Teacher.txt");
        File file2 = new File(folderPath+"/Student.txt");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File creation successfull.");
        }catch(Exception e){
            System.out.println("ERROR: "+e);
        }
    }
}
