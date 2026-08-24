import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 6, 5};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }


    //Optimal Time Complexity -> O(n) Space Complexity -> O(1)
    static void reverse(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
