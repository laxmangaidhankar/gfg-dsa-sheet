public class MaximumIndex {
    public static void main(String[] args) {
        int[] nums = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(optimal(nums));
    }

    static int optimal(int[] nums) {
        int n = nums.length;

        int[] rightMax = new int[n];
        int k = 0;

        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i + 1]);
        }

        int i = 0;
        int j = 0;
        int maxDiff = 0;

        while (i < n && j < n) {
            if (nums[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }

    static int better(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int maxDiff = 0;
        while (i < j) {
            if (nums[i] < nums[j]) {
                maxDiff = Math.max(maxDiff, j - i);
            }
            i++;
            j--;

        }
        return maxDiff;
    }


    static int brute(int[] nums) {
        int n = nums.length;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] < nums[j]) {
                    maxDiff = Math.max(maxDiff, j - i);
                }
            }
        }

        return maxDiff;
    }
}
