import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4, 5};
        System.out.println(Arrays.toString(optimal(nums, 4)));
    }


    static int[] optimal(int[] nums, int x) {
        int n = nums.length;

        int first = -1;
        int last = -1;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] > x) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] > x) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }


        return new int[]{first, last};

    }


    static int[] brute(int[] nums, int x) {

        int n = nums.length;
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                first = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == x) {
                last = i;
                break;
            }
        }
        return new int[]{first, last};
    }
}
