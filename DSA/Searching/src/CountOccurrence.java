public class CountOccurrence {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 4, 4};


        System.out.println(countOccurrences(nums, 4));


    }


    public static int countOccurrences(int[] nums, int x) {
        int first = optimal(nums, x, true);
        if (first == -1) return 0; // Early exit if element doesn't exist

        int last = optimal(nums, x, false);
        return last - first + 1;
    }

    static int optimal(int[] nums, int x, boolean isFirst) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int first = -1;
        int second = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x) {
                first = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return first;
    }

    static int brute(int[] nums, int x) {
        int count = 0;
        for (int num : nums) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }
}
