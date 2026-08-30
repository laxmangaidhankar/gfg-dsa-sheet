import java.util.Arrays;

public class RotateArrayByOne {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(betterApproach(nums)));
    }


    //TC O(n) SC O(1)
    static int[] betterApproach(int[] nums) {
        int n = nums.length;
        int temp = nums[n - 1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
        return nums;
    }

    //TC O(2n) SC O(n)
    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];

        temp[0] = nums[n - 1];
        int k = 1;

        for (int i = 0; i < n - 1; i++) {
            temp[k++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
}
