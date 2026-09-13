import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Pairswith0Sum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(better(nums));
    }

    static ArrayList<ArrayList<Integer>> better(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> uniqueFirstElements = new HashSet<>();

        for (int num : nums) {
            int complement = -num;
            if (seen.contains(complement)) {
                // The smaller element uniquely identifies the pair (u, -u)
                uniqueFirstElements.add(Math.min(num, complement));
            }
            seen.add(num);
        }

        // Sort the unique first elements to ensure the final list is in ascending order
        ArrayList<Integer> sortedFirst = new ArrayList<>(uniqueFirstElements);
        Collections.sort(sortedFirst);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int first : sortedFirst) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(first);
            pair.add(-first);
            result.add(pair);
        }

        return result;
    }

    static ArrayList<ArrayList<Integer>> optimal(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n - 1;


        //O(N log N) O(n)
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == 0) {
                ArrayList<Integer> pairs = new ArrayList<>();
                pairs.add(nums[left]);
                pairs.add(nums[right]);
                result.add(pairs);


                int leftVal = nums[left];
                int rightVal = nums[right];

                while (left < right && nums[left] == leftVal) {
                    left++;
                }

                while (left < right && nums[right] == rightVal) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return result;

    }


    //O(N^2) O(n)
    static ArrayList<ArrayList<Integer>> brute(int[] nums) {
        int n = nums.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == 0) {
                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);

                    ArrayList<Integer> pairs = new ArrayList<>();
                    pairs.add(a);
                    pairs.add(b);

                    if (!result.contains(pairs)) {
                        result.add(pairs);
                    }
                }
            }


        }
        Collections.sort(result, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return Integer.compare(a.get(0), b.get(0));
            }
            return Integer.compare(a.get(1), b.get(1));
        });
        return result;
    }
}
