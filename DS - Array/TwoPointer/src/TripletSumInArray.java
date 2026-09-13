import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 45, 6, 10, 8};
        int target = 13;

        System.out.println(optimal(nums, target));
    }

    static boolean optimal(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return false;
    }


    static boolean brute(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
