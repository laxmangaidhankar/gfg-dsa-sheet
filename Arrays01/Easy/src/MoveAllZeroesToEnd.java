import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 4, 3, 0, 5, 0};
        optimalApproach(nums);
        System.out.println(Arrays.toString(nums));
    }



    //O(n) O(1)
    static void optimalApproach(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[k++] = 0;
        }
    }

    //O(n) O(n)
    static void bruteApproach(int[] nums) {
        int[] temp = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[k++] = nums[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }
}
