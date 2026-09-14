import java.util.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        optimal(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void optimal(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (nums[left] == 0) left++;
            if (nums[right] == 1) right--;


            if (nums[left] == 1 && nums[right] == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }


    static void better(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else {
                count1++;
            }
        }


        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }

        for (int i = count0; i < nums.length; i++) {
            nums[i] = 1;
        }


    }

    static void brute(int[] nums) {
        Arrays.sort(nums);
    }
}
