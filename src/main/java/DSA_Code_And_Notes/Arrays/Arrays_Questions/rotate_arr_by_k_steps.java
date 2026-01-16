package DSA_Code_And_Notes.Arrays.Arrays_Questions;

import java.util.Scanner;

public class rotate_arr_by_k_steps {
    public static void reverse(int[] arr, int s, int k) {
        while (s < k) {
            int temp = arr[s];
            arr[s] = arr[k];
            arr[k] = temp;
            s++;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) { // Edge case: Empty array
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n; // Fixing the modulo operation
        if (k == 0) { // No rotation needed
            for (int num : arr) {
                System.out.print(num + " ");
            }
            sc.close();
            return;
        }

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
