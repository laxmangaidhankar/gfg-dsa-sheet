import java.util.Arrays;

public class PairWithDiff {

    public static void main(String[] args) {
        int[] nums = {1, 10, 1 ,1 ,7 ,2};

        System.out.println(better(nums, 8));

    }




    static boolean better(int[] nums, int x) {
        int n = nums.length;

        Arrays.sort(nums);

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int diff = Math.abs(nums[left] - nums[right]);

            if (diff == x) {
                return true;
            }

            if (diff < x) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
