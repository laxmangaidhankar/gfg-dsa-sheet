import java.util.Arrays;

public class DuplicateZeroes1089 {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};

        optimaApproach(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void optimaApproach(int[] nums){
        int countZeroes=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countZeroes++;
            }
        }
        int i=n-1;
        int j= n+countZeroes-1;

        while (i >= 0) {
            if (j < n) {
                nums[j] = nums[i];
            }

            if (nums[i] == 0) {
                j--;
                if (j < n) {
                    nums[j] = 0;
                }
            }

            i--;
            j--;
        }
    }


    //Brute Force Time Complexity -> O(n) Space Complexity -> O(n)
    static void bruteForce(int[] nums) {
        int[] result = new int[nums.length];

        int s = 0;
        int d = 0;

        while (s < nums.length) {
            if (nums[s] == 0) {
                if (d < nums.length) {
                    result[d] = 0;
                }

                d++;
                if (d < nums.length) {
                    result[d] = 0;
                }
            } else {
                if (d < nums.length) {
                    result[d] = nums[s];
                }

            }
            s++;
            d++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }

    }

}
