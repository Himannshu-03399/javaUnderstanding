package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    static class LearnComparator implements Comparator<Integer> {
        @Override
        public int compare( Integer o1, Integer o2) {
            return o2-o1;
        }

    }

    public static class learnStringComparator implements Comparator<String> {
        @Override
        public int compare(String o1 , String o2) {
            return o1.length() - o2.length(); // ascending order if o1 & o2 order will be same as parameter else descending
        }
    }

    public static void main(String[] args) {
        System.out.println("Learning Comparator Example");

        List<Integer> Markslist = new ArrayList<Integer>();
        Markslist.add(10);
        Markslist.add(-2);
        Markslist.add(0);
        Markslist.add(1);
        Markslist.add(13);
        Markslist.sort(null); // it will sort based on alphabets

        System.out.println(" Markslist natural order after sorting:" + Markslist);
        System.out.println("After Custom sorting in ascending order, marksList is ");
        Markslist.sort(new LearnComparator());
        System.out.println(Markslist);

        // operation over string
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Bye");
        words.add("Cool Bye");
        words.add("Vinay kumar");
        words.add("Ayushi");
        words.sort(null); // this will sort on the basis of alphabetic order not on word length
        System.out.println("After natural sorting on the basis of alphabet result is : "+words);

        words.sort(new learnStringComparator());

        System.out.println("After custom sorting based on length of words in descending order is : " + words);

        // using lambda function
        List<String> demoWords = new ArrayList<>();
        demoWords.add("Hey");
        demoWords.add("Byeee");
        demoWords.add("Coooooooooooool");
        demoWords.add("Vinay kumar");
        demoWords.sort((a,b) -> b.length() - a.length()); // words length in// descending order
        System.out.println(demoWords);


    }
}
