import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicatesInLimitedRange {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};
        System.out.println(Arrays.toString(optimalApproach(nums)));
    }


    //TC O(n) SC O(n)
    static int[] optimalApproach(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        int k = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                nums[k++] = key;
            }
        }
        return Arrays.copyOf(nums, k);
    }


    //TC O(n^2) SC O(n)
    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 2) {
                set.add(nums[i]);
            }
        }

        int[] result = new int[set.size()];
        int k = 0;
        for (int num : set) {
            result[k++] = num;
        }
        return result;
    }
}
