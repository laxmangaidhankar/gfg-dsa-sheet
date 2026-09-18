public class SearchElementinaRotatedSortedArrayII {

    public static void main(String[] args) {
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};

        System.out.println(optimal(nums, 10));

    }

    static boolean optimal(int[] nums, int x) {

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x) {
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= x && x <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= x && x <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    static boolean brute(int[] nums, int x) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                return true;
            }
        }
        return false;

    }
}
