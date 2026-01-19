package DSA_Code_And_Notes.Arrays.Array_Operations;

public class insert_at_n_position {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        // Insert 25 at index 2
        int n = arr.length;
        int index = 2;
        int value = 25;

        int[] newArr = new int[n + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        // Insert new element
        newArr[index] = value;

        // Copy remaining elements
        for (int i = index; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print array
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}

/*
 * 
 * Insertion at a Specific Index (Most Important)
 * 
 * Logic:
 * 1. Create a new array of size n + 1
 * 2. Copy elements before index
 * 3. Insert new element
 * 4. Shift remaining elements
 * 
 */