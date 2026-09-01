import java.util.Arrays;
import java.util.HashSet;

public class MakeADistinct {

    public static void main(String[] args) {
        int[] nums = {112, 12, 323, 12};

        System.out.println(Arrays.toString(distinct(nums)));
    }


    //O(total number of digits)
    //O(1)
    static int[] distinct(int[] nums) {

        boolean[] seen = new boolean[10];

        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                seen[digit] = true;
                num /= 10;
            }
        }

        int count = 0;

        for (boolean value : seen) {
            if (value) {
                count++;
            }
        }

        int[] result = new int[count];
        int k = 0;

        for (int i = 0; i < 10; i++) {
            if (seen[i]) {
                result[k++] = i;
            }
        }

        return result;
    }

    // O(n * d + k log k)
    // d = number of digits in each number
    // k = number of distinct digits (maximum 10)
    static int[] distinctt(int[] nums) {

        HashSet<Integer> unique = new HashSet<>();

        for (int num : nums) {
            unique.addAll(elements(num));
        }

        int[] result = new int[unique.size()];

        int k = 0;
        for (int num : unique) {
            result[k++] = num;
        }

        Arrays.sort(result);

        return result;
    }

    static HashSet<Integer> elements(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n > 0) {
            int digit = n % 10;
            set.add(digit);
            n /= 10;
        }

        return set;
    }
}