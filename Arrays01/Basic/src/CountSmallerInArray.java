public class CountSmallerInArray {

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 8, 4, 5};
        System.out.println(optimalApproach(nums, 9));
    }


    //TC O(n) SC O(1)
    static int optimalApproach(int[] nums, int x) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= x) {
                count++;
            }
        }
        return count;
    }
}
