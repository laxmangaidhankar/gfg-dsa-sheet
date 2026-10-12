public class MaxProductSubset {

    public static void main(String[] args) {
        int[] nums = {-1, 0, -2, 4, 3};
        System.out.println(brute(nums));
    }








    //Brute Force
    // Time: O(n × 2^n)
    //  Space: O(1)
    static int brute(int[] nums) {
        int n = nums.length;
        long maxProduct = Long.MIN_VALUE;
        for (int mask = 1; mask < (1 << n); mask++) {
            long product = 1;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    product = product * nums[i];
                }
            }

            maxProduct = Math.max(maxProduct, product);
        }

        return (int) maxProduct % 1000000007;
    }
}
