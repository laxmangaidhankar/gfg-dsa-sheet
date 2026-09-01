import java.util.Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] nums = {1, 8, 7, 56, 90};

    }


    //O(n) O(1)
    static int optimalApproach(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            largest = Math.max(largest, num);
        }

        return largest;
    }

    //O(n log n) O(1)
    static int bruteApproach(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

}
