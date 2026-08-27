public class LeftSmallerRightGreater {

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(optimalApproach(nums));

    }


    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(n)
    public static int optimalApproach(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return -1;
        }

        int[] rightMin = new int[n];

        // Minimum element to the right
        rightMin[n - 1] = Integer.MAX_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i + 1], rightMin[i + 1]);
        }

        int leftMax = arr[0];

        // Only middle elements can be the answer
        for (int i = 1; i < n - 1; i++) {

            if (leftMax <= arr[i] && arr[i] <= rightMin[i]) {
                return arr[i];
            }

            leftMax = Math.max(leftMax, arr[i]);
        }

        return -1;
    }

    //Better Approach Time Complexity -> O(n) Space Complexity -> O(n)
    public static int betterApproach(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i - 1]);
        }

        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i + 1]);
        }


        for (int i = 0; i < n; i++) {
            if (leftMax[i] <= nums[i] && nums[i] <= rightMin[i]) {
                return nums[i];
            }
        }
        return -1;
    }


    //Brute Force Time Complexity -> O(n^2) Space Complexity -> O(1)
    public static int bruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            boolean isLeftVerified = true;
            boolean isRightVerified = true;

            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    isLeftVerified = false;
                    break;
                }

            }

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    isRightVerified = false;
                    break;
                }
            }


            if (isLeftVerified && isRightVerified) {
                return nums[i];
            }
        }
        return -1;
    }


    public static int firstApproach(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                idx = i;
                break;
            }
        }

        for (int i = idx; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return -1;
            }
        }
        return idx;
    }
}
