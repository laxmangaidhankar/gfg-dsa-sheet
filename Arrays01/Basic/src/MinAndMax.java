import java.util.Arrays;

public class MinAndMax {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 34, 45, 45, 452, 1, 2, 12};
        System.out.println(Arrays.toString(bruteApproach(nums)));
    }

    //TC O(n) SC O(1)
    static int[] optimalApproach(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return new int[]{min, max};
    }


    //TC O(n log n) SC O(1)
    static int[] bruteApproach(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        return new int[]{min, max};
    }
}
