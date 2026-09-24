public class STSearchXinsortedarray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        System.out.println(optimal(nums, 5));
    }


    static int optimal(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int brute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
