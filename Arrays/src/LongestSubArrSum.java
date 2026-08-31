public class LongestSubArrSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(bruteForce(nums,1));
    }


    static int bruteForce(int[] nums, int x) {

        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];

                    if (sum == x) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
        }
        return maxLen;

    }
}
