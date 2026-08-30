import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class CountOddAndEven {

    public static void main(String[] args) {
        int[] nums = {1, 32, 32, 3, 34, 4};
        System.out.println(Arrays.toString(countOddEven(nums)));
    }

    static int[] countOddEven(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{oddCount, evenCount};
    }
}
