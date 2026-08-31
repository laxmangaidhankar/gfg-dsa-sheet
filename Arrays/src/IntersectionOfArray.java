import java.util.Arrays;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 23, 23, 23};
        int[] nums2 = {1, 1, 2, 2, 3, 3, 23, 23, 23, 23};
        System.out.println(Arrays.toString(optimalApproach(nums1, nums2)));
    }


    // Time: O(n1 + n2)
    // Space: O(1) auxiliary space
    // Output space: O(min(n1, n2))
    static int[] optimalApproach(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;


        int i = 0;
        int j = 0;

        int[] intersection = new int[Math.min(n1, n2)];

        int k = 0;


        while (i < n1 && j < n2) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums2[j] > nums1[i]) {
                i++;
            } else {
                intersection[k++] = nums1[i];
                i++;
                j++;
            }
        }

        return intersection;
    }

    //TC -> O(n1 × n2) SC -> O(n2)
    static int[] bruteForce(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] intersection = new int[Math.min(n1, n2)];
        int[] visited = new int[n2];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j] && visited[j] == 0) {
                    intersection[k++] = nums1[i];
                    visited[j] = 1;
                    break;
                }
                if (nums2[j] > nums1[i]) {
                    break;
                }
            }
        }
        return intersection;
    }
}
