import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void rotate(int[] nums) {
        int n = nums.length;
        int temp = nums[n - 1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = temp;

    }
}
