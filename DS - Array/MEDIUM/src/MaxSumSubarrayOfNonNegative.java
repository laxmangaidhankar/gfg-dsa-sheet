import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarrayOfNonNegative {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 6, 4, 3, -2, 0, 0, 2, 23, 23};
        System.out.println(optimal(nums));
    }


    static ArrayList<Integer> optimal(int[] nums) {
        int maxStart = -1;
        int maxEnd = -1;
        int currentStart = 0;
        int currentSum = 0;
        int maxSum = -1;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] < 0) {
                currentSum = 0;
                currentStart = i + 1;
                continue;
            }

            currentSum += nums[i];

            int currentLength = i - currentStart + 1;
            int maxLength = maxEnd - maxStart + 1;

            if (currentSum > maxSum || (currentSum == maxSum && currentLength > maxLength)) {
                maxSum = currentSum;
                maxStart = currentStart;
                maxEnd = i;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        if (maxStart == -1) {
            list.add(-1);
            return list;
        }

        for (int i = maxStart; i < maxEnd; i++) {
            list.add(nums[i]);
        }

        return list;
    }


    //TC -> O(n^2)
    //SC -> O(n)
    static ArrayList<Integer> brute(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            for (int j = i; j < n; j++) {
                if (nums[j] < 0) {
                    break;
                }

                list.add(nums[j]);
                sum += nums[j];

                if (sum > maxSum) {
                    maxSum = sum;

                    maxList = new ArrayList<>(list);
                }
            }
        }

        return maxList;
    }
}
