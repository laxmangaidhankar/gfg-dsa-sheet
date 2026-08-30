import java.util.Arrays;
import java.util.HashMap;

public class MissingAndRepeating {

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(betterApproach(nums)));


    }


    //O(n) O(n)
    static int[] betterApproach(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int missing = -1;
        int repeated = -1;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) == 2) {
                repeated = i;
            }
        }

        return new int[]{repeated, missing};
    }

    //O(n^2) O(n)
    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        int[] temp = new int[2];
        int k = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                temp[k++] = i;
            }
            if (count == 0) {
                temp[k++] = i;
            }
        }
        return temp;
    }
}
