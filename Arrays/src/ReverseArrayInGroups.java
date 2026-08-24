import java.util.Arrays;

public class ReverseArrayInGroups {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        optimalApproach(nums, k);
        System.out.println(Arrays.toString(nums));

    }





    //Time Complexity -> O(n) Space Complexity O(1)
    static void optimalApproach(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            reverse(nums, start, end);
        }
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
