package com.valluk.again;
public class string {
    public static void main(String[]args){
        String s1 = "Saikat";
        String s2 = new String("saikat");
        String s3 = "ktaiSa";
        String s4 = "Saikat";
        
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        System.out.println("s4: "+s4);
        
        System.out.println("\nlength of s1 is: "+s1.length());
        System.out.println("length of s1 is: "+s2.length());
        System.out.println("length of s1 is: "+s3.length());
        System.out.println("length of s1 is: "+s4.length());
        
        System.out.println("\nIs s1 contains s2? : "+s1.contains(s2));
        System.out.println("Is s1 contains s3? : "+s1.contains(s3));
        System.out.println("Is s1 contains s4? : "+s1.contains(s4));
        
        System.out.println("\nIs s1 equal to s2? : "+s1.equals(s2));
        System.out.println("Is s1 equal to s3? : "+s1.equals(s3));
        System.out.println("Is s1 equal to s4? : "+s1.equals(s4));
        
        System.out.println("\nIs s1 equal to s2 (ignoring case)? : "+s1.equalsIgnoreCase(s2));
        System.out.println("Is s1 equal to s3 (ignoring case)? : "+s1.equalsIgnoreCase(s3));
        System.out.println("Is s1 equal to s4 (ignoring case)? : "+s1.equalsIgnoreCase(s4));
        
        System.out.println("\nIs s1 contains 'Sa'? : "+s1.contains("Sa"));
        System.out.println("Is s2 contains 'Sa'? : "+s2.contains("Sa"));
        System.out.println("Is s3 contains 'Sa'? : "+s3.contains("Sa"));
        System.out.println("Is s4 contains 'Sa'? : "+s4.contains("Sa"));

        System.out.println("\nIs s1 empty? : "+s1.isEmpty());
        System.out.println("Is s2 empty? : "+s2.isEmpty());
        System.out.println("Is s3 empty? : "+s3.isEmpty());
        System.out.println("Is s4 empty? : "+s4.isEmpty());

        System.out.println("\nIs s1 blank? : "+s1.isBlank());
        System.out.println("Is s2 blank? : "+s2.isBlank());
        System.out.println("Is s3 blank? : "+s3.isBlank());
        System.out.println("Is s4 blank? : "+s4.isBlank());

        String s5 = "Shakil";
        String s6 = "Hossain";
        System.out.println("\nFull name: "+s5+s6+s4);
        System.out.println("Full name using (concat method): "+s5.concat(s6.concat(s4)));
        
        String fullName = s5.concat(s6.concat(s4));
        System.out.println("\nFull name in upper case: "+fullName.toUpperCase());
        System.out.println("Full name in lower case: "+fullName.toLowerCase());
        
        System.out.println("\nDoes s1 starts with 'S'? : "+s1.startsWith("S"));
        System.out.println("Does s2 starts with 'S'? : "+s2.startsWith("S"));
        System.out.println("Does s3 starts with 'S'? : "+s3.startsWith("S"));
        System.out.println("Does s4 starts with 'S'? : "+s4.startsWith("S"));
        System.out.println("Does s5 starts with 'S'? : "+s5.startsWith("S"));
        System.out.println("Does s6 starts with 'S'? : "+s6.startsWith("S"));
        System.out.println("Does full name starts with 'S'? : "+fullName.startsWith("S"));
        
        System.out.println("\nDoes s1 starts with 't'? : "+s1.endsWith("t"));
        System.out.println("Does s2 starts with 't'? : "+s2.endsWith("t"));
        System.out.println("Does s3 starts with 't'? : "+s3.endsWith("t"));
        System.out.println("Does s4 starts with 't'? : "+s4.endsWith("t"));
        System.out.println("Does s5 starts with 't'? : "+s5.endsWith("t"));
        System.out.println("Does s6 starts with 't'? : "+s6.endsWith("t"));
        System.out.println("Does full name starts with 't'? : "+fullName.endsWith("t"));
        
    }
}
