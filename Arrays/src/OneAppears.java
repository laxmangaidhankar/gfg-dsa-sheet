public class OneAppears {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};
        System.out.println(bruteForce(nums));
    }


    static int bruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}


