import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        System.out.println(Arrays.toString(firstAndLastO(nums, 8)));
    }


    static int[] firstAndLastO(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if(nums[mid]>x){
                high = mid - 1;
            }else{
                low = mid+1;

            }
        }

        low = 0;
        high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if(nums[mid]>x) {
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }

        return new int[]{first, last};


    }


    static int[] firstAndLast(int[] nums, int x) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                first = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == x) {
                last = i;
                break;
            }
        }

        return new int[]{first, last};


    }
}
