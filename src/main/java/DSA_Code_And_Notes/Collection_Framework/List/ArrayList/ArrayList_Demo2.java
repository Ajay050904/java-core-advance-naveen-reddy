package DSA_Code_And_Notes.Collection_Framework.List.ArrayList;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList_Demo2 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(55);
        marks.add(32);
        marks.add(78);
        marks.add(40);
        marks.add(28);

        Iterator<Integer> it = marks.iterator();

        while (it.hasNext()) {
            if (it.next() < 40) {
                it.remove();
            }
        }

        System.out.println("Final Marks List: " + marks);
    }
}
/*
 * Question: Write a Java program to:
 * *********
 * > Store student marks in an ArrayList
 * 
 * > Remove all marks less than 40
 * 
 * > Print the final list
 * 
 */