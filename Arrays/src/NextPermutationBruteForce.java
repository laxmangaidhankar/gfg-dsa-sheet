import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutationBruteForce {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        List<int[]> permutations = new ArrayList<>();

        generate(nums, 0, permutations);

        permutations.sort((a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return Integer.compare(a[i], b[i]);
                }
            }
            return 0;
        });


        for (int i = 0; i < permutations.size(); i++) {
            if (Arrays.equals(nums, permutations.get(i))) {

                if (i == permutations.size() - 1) {
                    System.arraycopy(permutations.get(0), 0, nums, 0, nums.length);
                } else {
                    // Otherwise copy the next permutation
                    System.arraycopy(permutations.get(i + 1), 0, nums, 0, nums.length);
                }
                return;
            }
        }
    }

    static void generate(int[] arr, int index, List<int[]> permutations) {

        // Base case
        if (index == arr.length) {
            permutations.add(arr.clone());
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Swap
            swap(arr, index, i);

            // Recursive call
            generate(arr, index + 1, permutations);

            // Backtrack
            swap(arr, index, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
