import java.util.Arrays;

public class SegregateEvenAndOd {

    public static void main(String[] args) {
        int[] nums = {12, 34, 45, 9, 8, 90, 3};

//        System.out.println(Arrays.toString(firstApproach(nums)));


        secondApproach(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void secondApproach(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n - 1;
        while (left < right) {

            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }


            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

        }

        Arrays.sort(nums, 0, left);
        Arrays.sort(nums, left, n);


    }


    //Time Complexity -> O(n log n) Space Complexity -> O(n)
    static int[] firstApproach(int[] nums) {

        int n = nums.length;

        int evenCount = 0;
        int oddCount = 0;

        // Count evens and odds
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        // Fill even array
        int evenIndex = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenArr[evenIndex++] = num;
            }
        }
        Arrays.sort(evenArr);

        // Fill odd array
        int oddIndex = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddArr[oddIndex++] = num;
            }
        }
        Arrays.sort(oddArr);

        int[] result = new int[n];

        int index = 0;

        // Put evens first
        for (int num : evenArr) {
            result[index++] = num;
        }

        // Then put odds
        for (int num : oddArr) {
            result[index++] = num;
        }

        return result;
    }
}