package DSA_Code_And_Notes.Collection_Framework.List.Vector.Stack;

import java.util.*;

public class Stack_Demo1 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);

        System.out.println(s.pop()); // 20
        System.out.println(s.peek()); // 10
    }
}