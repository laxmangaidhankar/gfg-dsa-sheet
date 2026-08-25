import java.util.Arrays;

public class RemoveElement27 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(bruteForce(nums, 1)));
    }


    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static int optimalApproach(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }


    //Brute Force Time Complexity -> O(n) Space Complexity -> O(n)
    static int[] bruteForce(int[] nums, int val) {
        int[] result = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                result[k++] = nums[i];
            }

        }

        return result;
    }
}
