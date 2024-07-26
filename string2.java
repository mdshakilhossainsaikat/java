package com.valluk.again;

public class string2 {
    public static void main(String[]args){
        String p = "         Bangladesh is my country             ";
        System.out.println("The sentence is: "+p);
        
        String s = p.trim();
        System.out.println("The corrected sentence is: "+s);
        
        System.out.println("The second cherecter of the sentence is: "+ s.charAt(1));
        System.out.println("ASCII code of the fifth charecter is: "+ s.codePointAt(4));
        System.out.println("The frist index of 'n' is: "+ s.indexOf('n'));
        System.out.println("The last index of 'n' is: "+s.lastIndexOf('n'));
        System.out.println("The index of 'is' is: "+ s.indexOf("is"));
        
        System.out.println("\nReplacing 'a' with 'o': "+s.replace('a', 'o'));
        System.out.print("Spliting according to blank spaces: ");
        String [] b = s.split(" ");
        for(String x : b){
            System.out.println(x);
        }
        
        
        
        
    }
}
