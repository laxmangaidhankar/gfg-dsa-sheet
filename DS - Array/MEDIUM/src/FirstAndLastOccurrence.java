import java.util.Arrays;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(Arrays.toString(brute(nums, 5)));
    }


    //TC -> O(log n)
    //SC -> O(1)
    static int[] optimal(int[] nums, int target) {

        int firstIdx = -1;
        int lastIdx = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstIdx = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }


        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                lastIdx = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{firstIdx, lastIdx};


    }



    //O(n) O(1)

    static int[] brute(int[] nums, int target) {
        int firstIdx = -1;
        int lastIdx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                firstIdx = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                lastIdx = i;
                break;
            }
        }

        return new int[]{firstIdx, lastIdx};
    }
}
