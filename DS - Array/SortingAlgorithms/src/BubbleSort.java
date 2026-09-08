import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void bubbleSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isSwapped = false;

            for (int j = 1; j < n - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }


    }


    static void better(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < n - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }


    //O(n) Best Case
    static void optimal(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }


    //O(n^2) O(1)
    static void brute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }
}
