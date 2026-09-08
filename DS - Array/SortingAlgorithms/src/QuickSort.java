import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {4, 3, 5, 2, 1};
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
    }


    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIdx = partition(nums, low, high);
            quickSort(nums, low, partitionIdx - 1);
            quickSort(nums, partitionIdx + 1, high);
        }


    }


    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];

        int i = low;
        int j = high;

        while (i < j) {

            while (nums[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (nums[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }


        int temp = nums[j];
        nums[j] = nums[low];
        nums[low] = temp;

        return j;
    }

}
