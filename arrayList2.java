/*
create an array list;
adding element to the array list;
see the size of the array list;
removing an element from the array list;
check either the list is empty or not;
check either the list contains a certain value;
find the index of a certain value;
set a certain value in a certain index;
get the value of a certain index;
add all values of a array list to another array list;
compare two array lists;
*/
package com.valluk.again;
import java.util.Random;
import java.util.ArrayList;
public class arrayList2 {
    public static void main(String[]args){
        Random rand = new Random();
        ArrayList<Integer>list1= new ArrayList<Integer>();
        
        System.out.print("0. Enter the length of the list: ");
        int n = rand.nextInt(10)+1;
        System.out.println(n);
        
        for(int i = 0; i<n; i++){
            list1.add(rand.nextInt(10));
        }
        System.out.println("\n1. Elements of list 1: "+ list1);
        
        System.out.println("\n2. The size of the list 1 is: "+list1.size());
        
        int remove = rand.nextInt(10);
        if(remove< list1.size()){
            list1.remove(remove);
            System.out.println("\n3. After removing the value of index "+remove+" the list is: "+list1 );
        }
        else{
            System.out.println("\n3. Invalid Input!");
        }
        
        System.out.println("\n4. Is this list empty now? : "+list1.isEmpty());
        
        int have = rand.nextInt(10);
        System.out.println("\n5. Does the list 1 contains "+have+" : "+list1.contains(have));
        
        if(list1.contains(have)){
            int haveindex = list1.indexOf(have);
            System.out.println("\n6. The index number of "+have+" is: "+haveindex);
        }
        else{
            System.out.println("\n6. Invalid Input!");
        }
        
        System.out.println("\n7. The value of index 0 in list 1: "+list1.get(0));
        
        list1.add(0, 100);
        System.out.println("\n8. After replacing the value of index 0 in list 1 with 100 we have: "+list1);
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list1);
        System.out.println("\n10. List 2: "+list2);
        
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i = 0; i<rand.nextInt(10)+1; i++){
            list3.add(rand.nextInt(10));
        }
        System.out.println("\n11. List 3: "+list3);
        
        System.out.println("\n12. List 2 is equal to list 1: "+list2.equals(list1));
        System.out.println("\n13. List 2 is equal to list 3: "+list2.equals(list3));
    }
}
