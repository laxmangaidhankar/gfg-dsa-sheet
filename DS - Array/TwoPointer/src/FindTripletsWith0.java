public class FindTripletsWith0 {

    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1};
        System.out.println(brute(nums));
    }

    static boolean optimal(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }

    static boolean brute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
