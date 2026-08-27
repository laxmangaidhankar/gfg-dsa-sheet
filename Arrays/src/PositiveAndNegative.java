import java.util.ArrayList;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 4, -5, 6};
        System.out.println(test(nums));
    }

    static ArrayList<Integer> test(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0;
        while (i < pos.size() && i < neg.size()) {
            result.add(pos.get(i));
            result.add(neg.get(i));
            i++;
        }

        while (i < pos.size()) {
            result.add(pos.get(i));
            i++;
        }

        while (i < neg.size()) {
            result.add(neg.get(i));
            i++;
        }

        return result;
    }
}
