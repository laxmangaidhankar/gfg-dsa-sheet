import java.util.Arrays;

public class ReverseArrayInGroups {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        brute(nums, 3);

        System.out.println(Arrays.toString(nums));
    }


    //optimal
    //Time Complexity -> O(n)
    //Space Complexity -> O(1)
    public static void optimal(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);

            reverse(nums, start, end);
        }
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    //Brute Approach
    //TC -> O(n)
    //SC -> O(k)
    public static void brute(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);

            int size = end - i;
            int[] temp = new int[size];
            for (int j = 0; j < size; j++) {
                temp[j] = nums[i + j];
            }

            for (int j = 0; j < size; j++) {
                nums[i + j] = temp[size - 1 - j];
            }
        }
    }

}
