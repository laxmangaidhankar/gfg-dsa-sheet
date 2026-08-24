import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayLeaders {


    public static void main(String[] args) {
        int[] nums = {30, 10, 10, 5};
        System.out.println(optimalApproach(nums));
    }

    //Time Complexity -> O(n) Auxiliary Space -> O(1)  Output Space  -> O(n)
    static ArrayList<Integer> optimalApproach(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int max = nums[n - 1];
        list.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }

    //Time Complexity -> O(n) Auxiliary Space -> O(n)  Output Space  -> O(n)
    static ArrayList<Integer> betterApproach(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        int[] suffixMax = new int[n];

        suffixMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(nums[i], suffixMax[i + 1]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= suffixMax[i + 1]) {
                list.add(nums[i]);
            }
        }

        list.add(nums[n - 1]);

        return list;
    }

    //Time Complexity -> O(n^2) Auxiliary Space -> O(1)  Output Space  -> O(n)
    static ArrayList<Integer> bruteForce(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}