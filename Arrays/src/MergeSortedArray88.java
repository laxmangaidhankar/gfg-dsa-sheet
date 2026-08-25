import java.util.Arrays;

public class MergeSortedArray88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1, 2, 5};
        optimalApproach(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }


    //Optimal Approach Time Complexity -> O(m+n) Space Complexity -> O(1)
    static void optimalApproach(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }


        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }

    }


    //Brute Force Time Complexity -> O((m+n) log(m+n))) Space Complexity O(m+n)
    static int[] bruteForce(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        for (int i = 0; i < m; i++) {
            result[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            result[i + m] = nums2[i];
        }

        Arrays.sort(result);
        return result;
    }
}
