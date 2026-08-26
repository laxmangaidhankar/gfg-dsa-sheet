import java.util.Arrays;

public class SortByParity905 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 23, 43, 2};
//        System.out.println(Arrays.toString(bruteForce(nums)));

        System.out.println(Arrays.toString(optimalApproach(nums)));
    }


    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static int[] optimalApproach(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = n - 1;
        while (start < end) {
            while (start < end && nums[start] % 2 == 0) {
                start++;
            }

            while (start < end && nums[end] % 2 != 0) {
                end--;
            }


            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        return nums;
    }

    //Time Complexity -> O(n) Space Complexity -> O(n)
    static int[] bruteForce(int[] nums) {
        int[] result = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[idx++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[idx++] = nums[i];
            }
        }
        return result;
    }
}
