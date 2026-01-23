package DSA_Code_And_Notes.Collection_Framework.List.Vector.Stack;

import java.util.Stack;

public class Stack_Demo2 {

    public static void main(String[] args) {

        String str = "{[()]}";
        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;

        for (char ch : str.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets
            else {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isBalanced = false;
        }

        System.out.println(isBalanced ? "Balanced" : "Not Balanced");
    }
}

/*
 * Question: Write a Java program to check whether a given string has balanced
 * ********* parentheses using Stack.
 * Example:
 * ********
 * > Input: "{[()]}"
 * > Output: Balanced
 * 
 * > Input: "{[(])}"
 * > Output: Not Balanced
 * 
 */