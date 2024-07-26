package com.valluk.again;
import java.util.*;
import java.text.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class dateNtime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current: "+date);
        
        DateFormat df =new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Current2: "+df.format(date));
        
        LocalTime time = LocalTime.now();
        System.out.println("Local time: "+time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Formatted time: "+time.format(formatter));
    }
}
