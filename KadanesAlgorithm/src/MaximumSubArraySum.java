public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(optimalApproach(nums));
    }


    static int optimalApproach(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }


    //Time Complexity -> O(n^2) Space Complexity -> O(1)
    static int betterApproach(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }


    //Time Complexity -> O(n^3) Space Complexity -> O(1)
    static int brutForce(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += nums[k];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }
}
