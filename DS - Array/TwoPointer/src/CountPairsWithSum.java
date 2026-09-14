import java.util.HashMap;

public class CountPairsWithSum {

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        System.out.println(optimal(nums, 6));
    }


    static int optimal(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                count = count + map.get(complement);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;

    }

    static int better(int[] nums, int target) {
        int n = nums.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            int lookUpNumber = target - nums[i];

            for (int j = i + 1; j < n; j++) {
                if (lookUpNumber == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    static int brute(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;
                }
            }

        }

        return count;
    }
}
