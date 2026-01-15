package DSA_Code_And_Notes.Arrays.Arrays_Questions;

import java.util.Scanner;

public class two_num_sum {
    public static void printTwoSum(int[] arr, int n, int target) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true;
                    return; // exit completely
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printTwoSum(arr, n, target);
        sc.close();
    }
}