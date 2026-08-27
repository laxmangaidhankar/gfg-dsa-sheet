import java.util.Arrays;

public class ConvertToZigZag {
    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 8, 6, 2, 1};

        test(nums);
        System.out.println(Arrays.toString(nums));

    }

    //Time Complexity -> O(n) Space Complexity -> O(1)
    static void test(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }
}
