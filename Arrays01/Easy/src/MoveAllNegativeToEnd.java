import java.util.Arrays;

public class MoveAllNegativeToEnd {

    public static void main(String[] args) {
        int[] nums = {1, 2, -1, 2, -1};
        optimalApproach(nums);
        System.out.println(Arrays.toString(nums));
    }



    //O(n) O(1)
    static void optimalApproach(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }


    }


    //O(n) O(n)
    static void bruteApproach(int[] nums) {
        int n = nums.length;
        int k = 0;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                temp[k++] = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                temp[k++] = nums[i];

            }
        }

        int i = 0;
        for (int num : temp) {
            nums[i++] = num;
        }


    }

}
