import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoRepeatedNumbers {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 3};
        System.out.println(Arrays.toString(better(nums)));
    }

    static int[] better(int[] nums) {
        int[] res = new int[2];
        boolean[] visited = new boolean[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (visited[nums[i]]) {
                res[count++] = nums[i];
                if (count == 2) break;
            } else {
                visited[nums[i]] = true;
            }
        }
        return res;
    }
}
