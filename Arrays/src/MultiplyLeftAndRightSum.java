public class MultiplyLeftAndRightSum {
    public static void main(String[] args) {

    }

    public int optimalApproach(int[] nums) {
        int mid = nums.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < mid) {
                leftSum += nums[i];
            } else {
                rightSum += nums[i];
            }
        }

        return leftSum * rightSum;
    }


    //Time Complexity -> O(n) Space Complexity -> O(1)
    public int betterApproach(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            leftSum += nums[i];
        }

        for (int i = nums.length / 2; i < nums.length; i++) {
            rightSum += nums[i];
        }

        return leftSum * rightSum;
    }


    //Time Complexity -> O(n) Space Complexity -> O(n)
    public int bruteForce(int[] nums) {
        // code here
        int[] right = new int[nums.length];

        int[] left = new int[nums.length];

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            left[i] = nums[i];
            leftSum += nums[i];
        }

        for (int i = nums.length / 2; i < nums.length; i++) {
            right[i] = nums[i];
            rightSum += nums[i];
        }


        return leftSum * rightSum;


    }
}
