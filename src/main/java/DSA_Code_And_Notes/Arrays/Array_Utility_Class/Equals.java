package DSA_Code_And_Notes.Arrays.Array_Utility_Class;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 2, 3, 4 };
        int[] arr3 = { 4, 5, 6, 7 };
        System.out.println(arr1.equals(arr2)); // false
        System.out.println(arr1 == arr2); // false
        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr1, arr3)); // false
    }
}
/*
 * Purpose: Compares content of two arrays
 * ********
 * Syntax: Arrays.equals(array1, array2);
 * *******
 * Key Points:
 * ***********
 * > Returns true if:
 * . Same length
 * . Same elements in same order
 * > Better than == operator
 * > Works for 1D array
 * 
 */