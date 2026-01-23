package DSA_Code_And_Notes.Collection_Framework.List.Vector;

import java.util.Vector;

public class Vector_Demo2 {

    public static void main(String[] args) {

        Vector<Integer> empIds = new Vector<>();

        // Add employee IDs
        empIds.add(101);
        empIds.add(102);
        empIds.add(103);
        empIds.add(102); // duplicate allowed

        // Remove employee ID by value
        // empIds.remove(102); // ❌ treated as index
        empIds.remove(Integer.valueOf(102));

        // Display final Vector
        System.out.println("Employee IDs: " + empIds);
    }
}

/*
 * 
 * Question: Write a Java program to:
 * *********
 * > Store employee IDs in a Vector
 * 
 * > Add multiple IDs
 * 
 * > Remove an ID by value
 * 
 * > Display the final list
 * 
 * (Assume the program may run in a multi-threaded environment.)
 * 
 */