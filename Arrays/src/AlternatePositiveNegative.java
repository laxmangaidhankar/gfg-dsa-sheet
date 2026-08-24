import java.util.Arrays;

public class AlternatePositiveNegative {

    public static void main(String[] args) {
        int[] nums = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        bruteForce(nums);
        System.out.println(Arrays.toString(nums));
    }


    //Time Complexity -> O(n) Space Complexity -> O(n)
    static void bruteForce(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];


        int posIndex = 0;
        int negIndex = 0;


        for (int num : arr) {
            if (num >= 0) {
                pos[posIndex++] = num;
            } else {
                neg[negIndex++] = num;
            }
        }

        int i = 0;
        int p = 0;
        int ng = 0;

        while (p < posIndex && ng < negIndex) {
            arr[i++] = pos[p++];
            arr[i++] = neg[ng++];
        }


        while (p < posIndex) {
            arr[i++] = pos[p++];
        }


        while (ng < negIndex) {
            arr[i++] = neg[ng++];
        }
    }

}

