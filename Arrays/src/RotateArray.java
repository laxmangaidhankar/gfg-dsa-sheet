import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        bruteForce(nums, 2);
    }


    //Brute Force Time Complexity -> O(n) Space Complexity -> O(n)
    static void bruteForce(int[] nums, int d) {
        int n = nums.length;
        d %= n;

        int[] result = new int[n];

        for (int i = d; i < n; i++) {
            result[i - d] = nums[i];
        }

        for (int i = 0; i < d; i++) {
            result[n - d + i] = nums[i];
        }
        System.out.println(Arrays.toString(result));

    }


    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static void rotate(int[] nums, int d) {
        int n = nums.length;
        d %= n;
        reverse(nums, 0, d - 1);
        reverse(nums, d, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
