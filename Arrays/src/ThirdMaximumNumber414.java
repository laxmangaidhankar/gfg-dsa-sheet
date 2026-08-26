import java.util.Arrays;

public class ThirdMaximumNumber414 {


    public static void main(String[] args) {
        int[] nums = {3, 2, 23, 23, 1};
        System.out.println(optimalApproach(nums));
    }


    static int optimalApproach(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == first || num == second || num == third) {
                continue;
            }
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
    }


    //Brute Force Time Complexity -> O(n log n) Space Complexity -> O(1)
    static int bruteForce(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int max = nums[n - 1];
        int count = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != max) {
                count++;
                max = nums[i];
            }

            if (count == 3) {
                return max;
            }
        }
        return nums[n - 1];
    }
}
