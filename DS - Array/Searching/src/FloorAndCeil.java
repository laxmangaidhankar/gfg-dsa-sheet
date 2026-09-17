import java.util.ArrayList;

public class FloorAndCeil {

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        System.out.println(floor(nums, 5));
        System.out.println(ceil(nums, 5));

        System.out.println(optimal(nums, 5));
    }


    static ArrayList<Integer> optimal(int[] nums, int x) {

        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();


        int low = 0;
        int high = n - 1;

        int floor = -1;
        int ceil = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        list.add(floor);


        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ceil = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        list.add(ceil);

        return  list;
    }


    static int floor(int[] nums, int x) {
        int n = nums.length;
        int floor = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= x) {
                floor = nums[i];
            }
        }

        return floor;
    }


    static int ceil(int[] nums, int x) {
        int ceil = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= x) {
                ceil = nums[i];
                break;
            }
        }

        return ceil;
    }

}

