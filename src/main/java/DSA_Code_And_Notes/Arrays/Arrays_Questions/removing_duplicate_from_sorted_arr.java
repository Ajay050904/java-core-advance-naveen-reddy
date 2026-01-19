package DSA_Code_And_Notes.Arrays.Arrays_Questions;

public class removing_duplicate_from_sorted_arr {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        /*
         * int[] arr = {4, 2, 4, 1, 2};
         * 
         * Set<Integer> set = new LinkedHashSet<>();
         * 
         * for (int x : arr) {
         * set.add(x);
         * }
         * 
         * System.out.println(set);
         */

        // Print unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * Logic: (Two-Pointer Technique)
 * 
 * 1. Keep one pointer j for unique elements
 * 2. Traverse array from index 1
 * 3. If current ≠ previous → store it
 * 4. Final size = j + 1
 */
