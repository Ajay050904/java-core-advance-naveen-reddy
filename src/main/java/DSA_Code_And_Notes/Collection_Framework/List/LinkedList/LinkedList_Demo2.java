package DSA_Code_And_Notes.Collection_Framework.List.LinkedList;

import java.util.LinkedList;

public class LinkedList_Demo2 {

    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add tasks
        tasks.add("Wake up");
        tasks.add("Study Java");

        // Add at beginning and end
        tasks.addFirst("Brush Teeth");
        tasks.addLast("Sleep");

        // Remove first completed task
        tasks.removeFirst();

        // Print remaining tasks
        System.out.println("Remaining Tasks: " + tasks);
    }
}

/*
 * Question: Write a Java program to:
 * *********
 * > Store a list of tasks in a LinkedList
 * 
 * > Add tasks at beginning and end
 * 
 * > Remove the first completed task
 * 
 * > Print remaining tasks
 * 
 */