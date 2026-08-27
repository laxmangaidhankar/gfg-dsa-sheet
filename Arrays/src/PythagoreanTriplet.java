import java.util.Arrays;
import java.util.HashSet;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 6, 5};
        System.out.println(firstApproach(nums));
    }

    static boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;

        // Square every element
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sort
        Arrays.sort(arr);

        // Fix c² from largest to smallest
        for (int i = n - 1; i >= 2; i--) {

            int left = 0;
            int right = i - 1;

            while (left < right) {

                int sum = arr[left] + arr[right];

                if (sum == arr[i]) {
                    return true;
                } else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }


    //Time Complexity -> O(n^2) Space Complexity -> O(n)
    static boolean firstApproach(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];

        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : squares) {
            set.add(num);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (set.contains(squares[i] + squares[j])) {
                    return true;
                }
            }
        }
        return false;

    }
}
