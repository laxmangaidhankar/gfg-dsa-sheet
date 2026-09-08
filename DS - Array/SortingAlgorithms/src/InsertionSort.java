import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {34,2,11,4,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = i;

            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
    }


    static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}
