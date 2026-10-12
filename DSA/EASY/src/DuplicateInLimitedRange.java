import java.util.Arrays;

public class DuplicateInLimitedRange {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3};
        System.out.println(Arrays.toString(bruteApproach(nums)));
    }

    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        int[] freq = new int[10];


        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (freq[i] == 2) {
                temp[k++] = nums[i];
            }
        }

        return Arrays.copyOf(temp,k);


    }
}
