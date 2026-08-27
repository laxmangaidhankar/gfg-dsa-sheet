import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        System.out.println(Arrays.toString(firstApproach(nums)));
    }


    //Time Complexity -> O(n log n) Space Complexity -> O(n)
    public static int[] firstApproach(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        Arrays.sort(nums);

        int start = 0;
        int end = n - 1;


        int idx = 0;
        while (start <= end) {
            result[idx++] = nums[end];
            end--;
            if (start <= end) {
                result[idx++] = nums[start];
                start++;
            }
        }
        return result;
    }
}

//
//if (idx != n) {
//result[idx++] = nums[start];
//start++;
//        }