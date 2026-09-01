import java.util.Arrays;
import java.util.HashMap;

public class MissingAndRepeating {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        System.out.println(Arrays.toString(betterApproach(nums)));

        System.out.println(missingNumber(nums));

    }


    //O(n) O(n)
    static int[] betterApproach(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];
        for (int num : nums) {
            freq[num]++;
        }

        int missing = -1;
        int duplicate = -1;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            }
            if (freq[i] == 2) {
                duplicate = i;
            }
        }
        return new int[]{duplicate, missing};
    }


    //O(n) O(n)
    static int[] bruteApproach(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int missing = -1;
        int duplicate = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) == 2) {
                duplicate = i;
            }
        }

        return new int[]{duplicate, missing};
    }


    static int missingNumber(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }
}
