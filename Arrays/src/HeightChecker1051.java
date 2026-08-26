import java.util.Arrays;

public class HeightChecker1051 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 2, 1, 3};
        System.out.println(bruteForce(nums));
    }


    //Brute Force Time Complexity -> O(n log n) Space complexity O(n)
    static int bruteForce(int[] heights) {
        int[] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        Arrays.sort(expected);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;

    }
}
