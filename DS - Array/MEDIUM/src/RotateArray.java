import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        optimal(nums, d);
        System.out.println(Arrays.toString(nums));

    }

    //O(n) O(1)
    static void optimal(int[] nums, int d) {
        int n = nums.length;
        d = d % n;

        reverse(nums, 0, d - 1);
        reverse(nums, d, n - 1);
        reverse(nums, 0, n - 1);

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


    //O(n) O(n)
    static void better(int[] nums, int d) {
        int n = nums.length;
        d = d % n;

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }

        for (int i = n - d; i < n; i++) {
            nums[i] = temp[i - (n - d)];
        }
    }


    //O(n) O(n)
    static void brute(int[] nums, int d) {
        int n = nums.length;
        d = d % n;

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }

        int j = 0;
        for (int i = n - d; i < n; i++) {
            nums[i] = temp[j];
            j++;
        }

    }
}
