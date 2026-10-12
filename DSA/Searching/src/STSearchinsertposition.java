public class STSearchinsertposition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(brute(nums, 7));
    }

    static int optimal(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int brute(int[] nums, int x) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i]>=x) {
                return i + 1;
            }
        }
        return n ;
    }

}
