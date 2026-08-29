import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] nums = {23, 23, 23, 32, 45, 45, 454, 212};
        System.out.println(optimalApproach(nums));
    }


    static int optimalApproach(int[] nums) {

        int n = nums.length;
        int fLargest = Integer.MIN_VALUE;

        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > fLargest) {
                sLargest = fLargest;
                fLargest = nums[i];
            } else if (nums[i] < fLargest && nums[i] > sLargest) {
                sLargest = nums[i];
            }
        }
        return sLargest;
    }


    //O(2n) O(1)
    static int betterApproach(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > firstMax) {
                firstMax = num;
            }
        }

        for (int num : nums) {
            if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        return secondMax;
    }


    //Time Complexity -> O(n log n) Space Complexity -> O(1)
    static int bruteForce(int[] nums) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        int n = nums.length;
        Arrays.sort(nums);

        first = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != first) {
                second = nums[i];
                break;
            }
        }

        return second;

    }
}
