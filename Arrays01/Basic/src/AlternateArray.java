import java.util.Arrays;

public class AlternateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(optimalApproach(nums)));
    }


    //TC O(n) Auxiliary Space O(1) Output Space O(n)
    static int[] optimalApproach(int[] nums) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i += 2) {
            nums[k++] = nums[i];
        }
        return Arrays.copyOf(nums, k);
    }

    //TC O(n) SC O(n)
    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i += 2) {
            temp[k++] = nums[i];
        }

        return Arrays.copyOf(temp, k);
    }
}
