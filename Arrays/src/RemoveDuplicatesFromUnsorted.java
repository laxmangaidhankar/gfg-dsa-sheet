import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsorted {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5, 5};
        System.out.println(test(nums));
    }




    //Time Complexity -> O(n) Space Complexity -> O(n)
    static ArrayList<Integer> test(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
}
