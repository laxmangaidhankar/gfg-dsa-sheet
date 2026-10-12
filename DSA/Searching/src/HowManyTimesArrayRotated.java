public class HowManyTimesArrayRotated {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6,0, 1, 2, 3};
        System.out.println(better(nums));
    }

    static int findMinIndexWithDuplicates(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum lies strictly to the right of mid
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {
                // Minimum is at mid or to the left of mid
                high = mid;
            } else {
                // nums[mid] == nums[high]: safe to trim high by 1
                high--;
            }
        }
        return low;
    }


    static int better(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int index = 0;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If whole subarray [low...high] is sorted
            if (nums[low] <= nums[high]) {
                if (nums[low] < ans) {
                    index = low;
                    ans = nums[low];
                }
                break;
            }

            // Use <= to correctly handle low == mid
            if (nums[low] <= nums[mid]) {
                if (nums[low] < ans) {
                    index = low;
                    ans = nums[low];
                }
                low = mid + 1;
            } else {
                if (nums[mid] < ans) {
                    index = mid;
                    ans = nums[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }


    static int optimal(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;

            } else {
                high = mid - 1;

            }
        }
        return low;
    }


    static int brute(int[] nums) {

        int n = nums.length;
        int minIdx = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
}
