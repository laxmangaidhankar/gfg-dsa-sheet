import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class FloorAndCeil {

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};

        System.out.println(Arrays.toString(floorCeilBF(nums, 5)));
    }


    static int[] floorCeilO(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int ceil = -1;
        int floor = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == x) {
                return new int[]{x, x};
            } else if (nums[mid] < x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                ceil = nums[mid];
                high = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }


    static int[] floorCeilBF(int[] nums, int x) {
        int floor = -1;
        int ceil = -1;

        for (int num : nums) {
            if (num == x) {
                return new int[]{x, x};

            } else if (num < x) {
                floor = num;
            } else if (num > x) {
                ceil = num;
                break;
            }
        }

        return new int[]{floor, ceil};
    }


}
