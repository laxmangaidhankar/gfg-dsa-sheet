import java.util.Arrays;

public class AtLeastTwoGreater {
    public static void main(String[] args) {
        long[] nums = {1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(brute(nums)));
    }




    //TC -> O(n^2) O(n)
    static long[] brute(long[] nums) {
        int n = nums.length;
        long[] arr = new long[n - 2];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    long temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;

                }
            }
        }
        int k = 0;
        for (int i = 0; i < n - 2; i++) {
            arr[k++] = nums[i];
        }

        return arr;
    }

}
