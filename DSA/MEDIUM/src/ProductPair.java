import java.util.HashSet;
import java.util.Set;

public class ProductPair {

    public static void main(String[] args) {
        int[] nums = {10, 20, 9};
        System.out.println(optimal(nums, 400));
    }


    static boolean optimal(int[] nums, int target) {
        Set<Long> set = new HashSet<>();

        int n = nums.length;

        for (int num : nums) {
            if (target == 0) {
                if (num == 0 && !set.isEmpty()) {
                    return true;
                }
            } else {
                if (num != 0 && target % num == 0) {
                    long needed = target / num;

                    if (set.contains(needed)) {
                        return true;
                    }
                }
            }

            set.add((long) num);
        }
        return false;
    }


    static boolean brute(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];

                if (product == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
