package DSA_Code_And_Notes.Arrays.Array_Operations;

public class finding_max_min_sum_avg {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 5, 40, 15 };

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];

            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}