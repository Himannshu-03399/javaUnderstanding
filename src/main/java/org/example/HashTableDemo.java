package org.example;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

        // Hashtable is synchronized
        // in Hashtable we can't put null key or value
        // legacy class , now we are using ConcurrentHashMap
        // slower than HashMap because of overhead due to thread safe
        // all methods are synchronized
       // in case of collision in Hashtable to store entries only LinkedList used,
       // unlike HashMap use LinkedList and after threshold it uses TreeMap



        /*
        🔑 HashMap vs Hashtable

          HashMap is not synchronized → multiple threads can modify it at the same time (not thread-safe).
               - Because of no synchronization overhead, it is faster in single-threaded applications.
               -** Allows one null key and multiple null values.

         Hashtable is synchronized every method (put, get, etc.) is synchronized.
               - This means only one thread can access it at a time.
               - Because of synchronization overhead, it is slower compared to HashMap.
               - *** Doesn’t allow null key and doesn’t allow null values.

       ⚡  Why is Hashtable slower?

               - Each operation (like put, get) requires acquiring a lock first.
               - Locking/unlocking causes extra overhead.

       ✅ Modern Recommendation:

            - Use HashMap in single-threaded applications.

            - If you need thread-safety, use ConcurrentHashMap instead of Hashtable (because it uses fine-grained locks, so much faster).


     | Feature                | HashMap (Java 8+)    | Hashtable        |
     | ---------------------- | -------------------- | ---------------- |
     | Collision Handling     | LinkedList → TreeMap | LinkedList only  |
     | Worst Case Lookup Time | O(log n)             | O(n)             |
     | Performance            | Better               | Slower           |
     | Introduced             | JDK 1.2              | JDK 1.0 (Legacy) |


         */

    public static void main(String ... abc) {

        Hashtable<String, Integer> fruitsPrice = new Hashtable<>();
        fruitsPrice.put("Apple", 150);
        fruitsPrice.put("Banana", 40);
        fruitsPrice.put("Orange", 100);
        fruitsPrice.put("Apple", 120); // override value 120
        //fruitsPrice.put( null, 15); // in Hashtable we can't invoke hashCode() because of key is null
       // fruitsPrice.put("Pineapple", null); // we can't put null value in Hashtable

        System.out.println("fruitsPrice is " + fruitsPrice);
        fruitsPrice.forEach((a, b) -> System.out.println( "price  of " + a + " is: " + b));

        System.out.println(fruitsPrice.putIfAbsent("Guava", 60));
        fruitsPrice.remove("Guavaa");

        HashMap<String, Integer> fruits = new HashMap< String,Integer>();
        fruits.put("Pineapple", 250);

        fruitsPrice.putAll(fruits); // this can take another map

        System.out.println(fruitsPrice.entrySet());
    }

}
