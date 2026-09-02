import java.util.Arrays;

public class RearrangeAlternatively {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        optimal(nums);
        System.out.println(Arrays.toString(nums));
    }


    //Time Complexity -> O(n)
    //Space Complexity -> O(1)
    public void rearrange(int[] nums) {

        int n = nums.length;

        // Find maximum + 1
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int mod = max + 1;

        int maxIdx = n - 1;
        int minIdx = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                // Store maximum
                nums[i] += (nums[maxIdx] % mod) * mod;
                maxIdx--;
            } else {
                // Store minimum
                nums[i] += (nums[minIdx] % mod) * mod;
                minIdx++;
            }
        }

        // Extract the new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / mod;
        }
    }


    //TC -> O(n log n)
    //SC -> O(n)
    static void optimal(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        int[] temp = new int[n];
        int k = 0;

        while (left <= right) {
            temp[k++] = nums[right--];

            if (left <= right) {
                temp[k++] = nums[left++];
            }


        }
        int i = 0;
        for (int num : temp) {
            nums[i++] = num;
        }

    }

    //O(n^2) O(1) If Array is not sorted Already
    static void better(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            reverse(nums, i, n - 1);
        }
    }


    //O(n^2) For Sorted Array
    static void brute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            reverse(nums, i, n - 1);
        }
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
