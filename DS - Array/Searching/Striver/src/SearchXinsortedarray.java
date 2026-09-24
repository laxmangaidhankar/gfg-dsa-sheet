public class SearchXinsortedarray {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(searchO(nums, -1));
    }


    static int searchO(int[] nums, int target) {
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


    static int searchBF(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
