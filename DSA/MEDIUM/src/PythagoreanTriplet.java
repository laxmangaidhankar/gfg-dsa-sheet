import java.util.Arrays;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6};
        System.out.println(better(nums));
    }


    //O(n^2) O(1)
    static boolean better(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);


        for (int c = n - 1; c >= 2; c--) {
            int left = 0;
            int right = c - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == nums[c]) {
                    return true;
                } else if (sum < nums[c]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }


    //O(n^3) O(n)
    static boolean brute(int[] nums) {

        int n = nums.length;
        int[] temp = new int[n];

        int k = 0;
        for (int num : nums) {
            temp[k++] = num * num;
        }

        Arrays.sort(temp);


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = temp[i] + temp[j];

                for (int p = 0; p < n; p++) {
                    if (sum == temp[p]) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
