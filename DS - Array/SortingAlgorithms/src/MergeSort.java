import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 9, 7};
        mergeSort2(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }


    public static void mergeSort2(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }


        int mid = low + (high - low) / 2;

        mergeSort2(nums, low, mid);
        mergeSort2(nums, mid + 1, high);
        merge2(nums, low, mid, high);
    }

    public static void merge2(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];
        int k = 0;

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }


        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }


    }


    //O(n) × O(log n) = O(n log n)
    //O(n)

    static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }


    public static void merge(int[] nums, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        int[] temp = new int[high - low + 1];
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }

}
