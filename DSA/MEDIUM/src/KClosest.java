import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KClosest {


    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(brute(nums, 3, 25));

    }


    static ArrayList<Integer> brute(int[] nums, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != x) {
                list.add(nums[i]);
            }
        }

        Collections.sort(list, (a, b) -> {
            int diffA = Math.abs(a - x);
            int diffB = Math.abs(b - x);

            if (diffA != diffB) {
                return diffA - diffB;
            }


            return b - a;
        });

        return new ArrayList<>(list.subList(0, k));
    }

}
