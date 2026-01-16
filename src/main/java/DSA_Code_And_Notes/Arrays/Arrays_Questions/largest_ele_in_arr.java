package DSA_Code_And_Notes.Arrays.Arrays_Questions;

public class largest_ele_in_arr {

    // Method to find the largest element in the array
    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {

        // Input array
        int[] arr = { 12, 45, 7, 89, 34, 89 };

        System.out.println("Given array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nFinding the largest element...");

        int result = largest(arr);

        System.out.println("Largest element in the array is: " + result);
    }
}