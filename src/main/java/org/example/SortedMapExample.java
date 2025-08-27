package org.example;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args)  {


        SortedMap<Integer, String> rollNumber = new TreeMap<>();
        rollNumber.put(1, "Himanshu");
        rollNumber.put(3, "Vinay");
        rollNumber.put(5, "Ayush");
        rollNumber.put(9, "Patel");
        rollNumber.put(15, "Sujeet");
        //rollNumber.put(null, "kumar"); // it will give null Pointer Exception because it required sorting and null can't be sort
        rollNumber.put(17, null); // it will allow

        System.out.println("rollNumber of " + rollNumber.get(1) + " is : " + rollNumber.firstEntry().getKey());;
        System.out.println(rollNumber.get(25)); // null

        System.out.println(rollNumber.containsKey(100));
        System.out.println(rollNumber.containsValue("Patel"));

        System.out.println(rollNumber); // it is store data as natural ordering based on  key
        // some important methods
        System.out.println(rollNumber.firstKey()); // it will print 1st key of map
        System.out.println(rollNumber.firstEntry()); // it will print both key & value
        System.out.println(rollNumber.headMap(5)); // exclude mentioned key
        System.out.println(rollNumber.tailMap(5)); // include
        System.out.println(rollNumber.subMap(3,15)); // exclude last

        System.out.println(rollNumber.keySet()); // it will give all keys
    }

}
