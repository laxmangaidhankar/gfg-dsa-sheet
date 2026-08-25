import java.util.Arrays;

public class SquaresOfSortedArray977 {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(optimalApproach(nums)));
    }


    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(n)
    static int[] optimalApproach(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int start = 0;
        int end = n - 1;
        int idx = n - 1;
        while (start <= end) {
            int leftSq = nums[start] * nums[start];
            int rightSq = nums[end] * nums[end];

            if (rightSq > leftSq) {
                result[idx--] = rightSq;
                end--;
            } else {
                result[idx--] = leftSq;
                start++;
            }
        }

        return result;
    }


    //Brute Force Time Complexity -> O(n log n) Space Complexity - O(n)
    static int[] bruteForce(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }

}
