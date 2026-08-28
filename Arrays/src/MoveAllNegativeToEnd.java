import java.util.Arrays;

public class MoveAllNegativeToEnd {
    public static void main(String[] args) {
        int[] nums = {1, -1, 3, 2, -7, -5, 11, 6};
        secondApproach(nums);
        System.out.println(Arrays.toString(nums));
    }




    //Order not maintain
    //Time Complexity -> O(n) Space Complexity -> O(1)
    static void secondApproach(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {

            while (left < right && nums[left] > 0) {
                left++;
            }
            while (left < right && nums[right] < 0) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }


        }
    }


    //Order Maintain
    //Time Complexity -> O(n) Space Complexity -> O(n)
    static void firstApproach(int[] nums) {

        int n = nums.length;
        int[] temp = new int[n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                temp[k++] = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                temp[k++] = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
