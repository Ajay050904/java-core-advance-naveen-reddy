package DSA_Code_And_Notes.Arrays.Array_Operations;

public class delete_at_n_position {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        // Delete element at index 2
        int index = 2;
        int n = arr.length;

        int[] newArr = new int[n - 1];

        for(int i = 0, j = 0; i < n; i++)
        {
            if (i == index)
                continue;
            newArr[j++] = arr[i];
        }

        // Print array
        for(int x : newArr)
        {
            System.out.print(x + " ");
        }
    }
}
/*
 * Deletion from a Specific Index (Most Important)
 * 
 * Logic:
 * 1. Identify the index to delete
 * 2. Shift elements one position left
 * 3. Reduce logical size by 1
 * 
 */