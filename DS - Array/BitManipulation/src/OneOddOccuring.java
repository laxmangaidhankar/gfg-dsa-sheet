public class OneOddOccuring {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3};
        System.out.println(better(nums));
    }

    //O(n) O(1)
    static int better(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }

        return res;
    }


    //O(n^2) O(1)
    static int brute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                return nums[i];
            }
        }
        return -1;
    }
}
