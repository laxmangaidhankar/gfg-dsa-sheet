import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> optimal(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            list.add(nums[right--]); // largest
            if (left <= right) {
                list.add(nums[left++]); // smallest
            }
        }

        return list;
    }


    //O(n^2) O(n)
    public static ArrayList<Integer> brute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            reverse(nums, i, n - 1);
        }

        for (int num : nums) {
            list.add(num);
        }

        return list;
    }


    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

