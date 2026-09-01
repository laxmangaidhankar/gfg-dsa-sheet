import java.util.Arrays;

public class KthElement {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 6, 7, 9};
        int[] nums2 = {1, 4, 8, 10};
        System.out.println(brute(nums1, nums2, 5));
    }


    //Optimal Approach
    //Time Complexity -> O(k)
    //Space Complexity -> O(1)
    public static int optimal(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;


        int i = 0;
        int j = 0;
        int count = 0;
        int element = -1;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                element = nums1[i];
                i++;
            } else {
                element = nums2[j];
                j++;
            }

            count++;

            if (count == k) {
                return element;
            }
        }

        // Remaining elements of nums1
        while (i < nums1.length) {
            element = nums1[i];
            i++;
            count++;

            if (count == k) {
                return element;
            }
        }

        // Remaining elements of nums2
        while (j < nums2.length) {
            element = nums2[j];
            j++;
            count++;

            if (count == k) {
                return element;
            }
        }

        return -1;
    }


    //Better Approach
    //Time Complexity -> O(n)
    //Space Complexity -> O(n)
    public static int better(int[] nums1, int[] nums2, int k) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] combine = new int[n1 + n2];
        int n3 = combine.length;

        int pos1 = n1 - 1;
        int pos2 = n2 - 1;
        int pos3 = n3 - 1;

        while (pos1 >= 0 && pos2 >= 0) {
            if (nums1[pos1] > nums2[pos2]) {
                combine[pos3] = nums1[pos1];
                pos1--;
            } else {
                combine[pos3] = nums2[pos2];
                pos2--;
            }

            pos3--;
        }

        while (pos1 >= 0) {
            combine[pos3] = nums1[pos1];
            pos3--;
            pos1--;
        }

        while (pos2 >= 0) {
            combine[pos3] = nums2[pos2];
            pos3--;
            pos2--;
        }

        return combine[k - 1];
    }


    public static int brute(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] combine = new int[n1 + n2];

        int d = 0;
        for (int i = 0; i < n1; i++) {
            combine[d++] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            combine[d++] = nums2[i];
        }

        Arrays.sort(combine);

        return combine[k - 1];
    }
}

