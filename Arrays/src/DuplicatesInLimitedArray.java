import java.util.ArrayList;
import java.util.HashMap;

public class DuplicatesInLimitedArray {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 3};
        System.out.println(findDuplicatesBetter(nums));
    }

    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static public ArrayList<Integer> findDuplicatesOptimal(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index = num - 1;

            if (nums[index] < 0) {
                list.add(num);
            } else {
                nums[index] = -nums[index];
            }
        }

        return list;
    }

    //Better Approach Time Complexity -> O(n) Space Complexity -> O(n)
    static public ArrayList<Integer> findDuplicatesBetter(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                list.add(key);
            }
        }

        return list;


    }


    //Brute Force Time Complexity -> O(n^2) Space Complexity -> O(n)
    static public ArrayList<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    list.add(nums[i]);
                }
            }
        }
        return list;

    }
}
