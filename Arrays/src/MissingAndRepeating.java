import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        System.out.println(optimalApproach(nums));
    }


    static ArrayList<Integer> optimalApproach(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int missing = -1;
        int duplicate = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            }

            if (freq[i] == 0) {
                missing = i;
            }
        }

        list.add(duplicate);
        list.add(missing);

        return list;

    }


    //Time Complexity -> O(n^2) Space Complexity -> O(1)
    static ArrayList<Integer> bruteForce(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int missing = -1;
        int duplicate = -1;

        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                duplicate = i;
            }

            if (count == 0) {
                missing = i;
            }
        }

        list.add(duplicate);
        list.add(missing);

        return list;
    }
}
