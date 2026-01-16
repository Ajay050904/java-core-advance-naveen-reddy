package DSA_Code_And_Notes.Arrays.Arrays_Questions;

public class reverse_of_arr {

    // Method to reverse the array in place
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swapping elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {

        // Input array
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nReversing the array...");

        reverseArray(arr);

        System.out.println("Array after reversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}