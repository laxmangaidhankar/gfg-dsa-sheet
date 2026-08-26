import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        optimalApproach(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(bruteForce(nums)));
    }


    //Time Complexity -> O(n) Space Complexity -> O(1)
    static void optimalApproach(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    //Brute Force Time Complexity -> O(n) Space Complexity -> O(n)
    static int[] bruteForce(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            result[i] = 0;
        }

        return result;
    }
}
