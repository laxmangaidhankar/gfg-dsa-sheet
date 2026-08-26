public class ValidMountainArray941 {

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 5, 2, 1, 0};
        System.out.println(bruteForce(nums));
    }


    //Optimal Solution -> O(n) Space Complexity -> O(1)
    static boolean optimalApproach(int[] nums) {
        int n = nums.length;
        int i = 0;

        if (n < 3) {
            return false;

        }

        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i < n - 1 && nums[i] > nums[i + 1]) {
            i++;
        }

        return i == n - 1;
    }


    //First Thought Time Complexity -> O(n) Space Complexity -> O(1)
    static boolean bruteForce(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == 0) {
            return false;
        }

        if (idx == nums.length - 1) {
            return false;
        }

        for (int i = idx; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                return false;
            }
        }
        return true;


    }
}
