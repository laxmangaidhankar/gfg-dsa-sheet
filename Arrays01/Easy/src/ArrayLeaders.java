import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLeaders {

    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
//        System.out.println(optimalApproach(nums));
        System.out.println(Arrays.toString(bruteApproach(nums)));
    }


    //TC O(n) SC O(n) Auxiliary space: O(1)
    static ArrayList<Integer> optimalApproach(int nums[]) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        if (nums.length == 0) {
            return new ArrayList<>();
        }

        int max = nums[n - 1];
        list.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= max) {
                max = nums[i];
                list.add(max);
            }
        }
        Collections.reverse(list);

        return list;

    }


    //TC O(n^2) SC O(n)
    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                ans[k++] = nums[i];
            }
        }

        return Arrays.copyOf(ans, k);
    }
}
