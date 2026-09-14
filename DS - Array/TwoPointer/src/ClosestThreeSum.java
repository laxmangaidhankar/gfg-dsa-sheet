import java.util.Arrays;

public class ClosestThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 2, 4};
        System.out.println(optimal(nums, 4));
    }


    static int optimal(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int closeSum = nums[0] + nums[1] + nums[2];

        int minDiff = Math.abs(closeSum - target);

        for (int i = 0; i < n - 2; i++) {


            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diff = Math.abs(sum - target);
                if (sum == target) {
                    return target;
                }

                if (diff < minDiff) {
                    minDiff = diff;
                    closeSum = sum;
                } else if (diff == minDiff) {
                    closeSum = Math.max(closeSum, sum);
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closeSum;
    }


    static int brute(int[] nums, int target) {
        int n = nums.length;

        int closeSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closeSum - target);


        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(sum - target);

                    if (diff < minDiff) {
                        minDiff = diff;
                        closeSum = sum;
                    } else if (diff == minDiff) {
                        closeSum = Math.max(closeSum, sum);
                    }


                }
            }
        }
        return closeSum;
    }
}
