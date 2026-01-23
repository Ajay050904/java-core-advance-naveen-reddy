package DSA_Code_And_Notes.Collection_Framework.List.Vector;

import java.util.*;

public class Vector_Demo1 {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add(1);

        System.out.println(v); // [1, 2, 1]
    }
}