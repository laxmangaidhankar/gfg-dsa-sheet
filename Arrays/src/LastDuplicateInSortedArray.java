public class LastDuplicateInSortedArray {

    public static void main(String[] args) {

    }

    public int[] dupLastIndex(int[] nums) {
        // Complete the function
        int n = nums.length;


        for (int i = n - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                return new int[]{i, nums[i]};
            }
        }
        return new int[]{-1, -1};
    }
}
