package DSA_Code_And_Notes.Arrays;

public class linear_binary_search {

    // linear search
    public static int linearSearch(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }
        return -1;
    }

    // binary serach - works on sorted arrays only
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 9, 11, 13 };
        int target1 = 111;
        int target2 = 11;
        int result1 = linearSearch(nums, target1);
        int result2 = binarySearch(nums, target2);
        if (result1 != -1) {
            System.out.println("Element found at index: " + result1 + " using Linear Search");
        } else {
            System.out.println("Element not found in the array.");
        }
        if (result2 != -1) {
            System.out.println("Element found at index: " + result2 + " using Binary Search");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
