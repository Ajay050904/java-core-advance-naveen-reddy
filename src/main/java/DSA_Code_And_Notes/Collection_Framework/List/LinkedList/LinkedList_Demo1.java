package DSA_Code_And_Notes.Collection_Framework.List.LinkedList;

import java.util.*;

public class LinkedList_Demo1 {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");

        System.out.println(list); // [Java, Python, Java]
    }
}