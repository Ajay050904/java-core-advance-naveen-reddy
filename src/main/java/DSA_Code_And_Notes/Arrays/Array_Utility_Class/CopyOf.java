package DSA_Code_And_Notes.Arrays.Array_Utility_Class;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int[] newArr = Arrays.copyOf(arr, 6);

        System.out.println(Arrays.toString(newArr));

    }
}
/*
 * Arrays.copyOf()
 * ```````````````
 * Purpose: Creates a new array copy with given length
 * ````````
 */