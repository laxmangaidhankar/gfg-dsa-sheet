public class UpperBound {

    public static void main(String[] args) {
        int[] nums= {3,5,8,15,19};
        System.out.println(upperBoundO(nums, 9));
    }


    static int upperBoundO(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int upperBoundBF(int[] nums, int x) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > x) {
                return i;
            }
        }

        return n;
    }
}
