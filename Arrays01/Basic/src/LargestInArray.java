import java.util.Arrays;

public class LargestInArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 88, 23, 2311, 45};
        System.out.println(optimalApproach(nums));
    }


    //TC O(n) SC O(1)
    static int optimalApproach(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //TC O(n log n) SC O(1)
    static int bruteApproach(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}
