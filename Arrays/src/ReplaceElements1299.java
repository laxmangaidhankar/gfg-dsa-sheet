import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceElements1299 {

    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(optimalApproach(nums)));
    }



    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static int[] optimalApproach(int[] nums){
        int max =-1;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int temp = nums[i];
            nums[i]=max;
            max = Math.max(max, temp);
        }
        return nums;
    }

    //Brute Force Time Complexity -> O(n^2) Space Complexity -> O(n)
    static int[] bruteForce(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            int max = nums[i + 1];
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }

        result[n - 1] = -1;

        return result;
    }
}
