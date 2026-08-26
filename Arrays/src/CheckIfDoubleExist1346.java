import java.util.HashSet;

public class CheckIfDoubleExist1346 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 4, 5};
        System.out.println(betterApproach(nums));
    }


    //Better Approach Time Complexity -> O(n) Space Complexity -> O(n)
    static boolean betterApproach(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num * 2) ||
                    (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }

            set.add(num);
        }
        return false;
    }


    //Brute Force Time Complexity -> O(n^2) Space Complexity -> O(1)
    static boolean bruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] * 2 || nums[j] == nums[i] * 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
