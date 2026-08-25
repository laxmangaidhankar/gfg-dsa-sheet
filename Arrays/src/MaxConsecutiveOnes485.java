public class MaxConsecutiveOnes485 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(nums));
    }


    //First Thought Time Complexity -> O(n) Space Complexity -> O(1)
    static int maxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
