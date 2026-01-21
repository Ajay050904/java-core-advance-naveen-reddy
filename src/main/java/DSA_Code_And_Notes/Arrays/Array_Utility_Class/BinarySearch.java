package DSA_Code_And_Notes.Arrays.Array_Utility_Class;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int index = Arrays.binarySearch(arr, 30);
        System.out.println(index);
    }
}
/*
 * Purpose: Searches element using Binary Search
 * ********
 */
