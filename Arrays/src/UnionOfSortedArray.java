import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 6};
        int[] nums2 = {2, 3, 4, 5, 6, 8};
        System.out.println(Arrays.toString(optimalApproach(nums1, nums2)));
    }


    static int[] optimalApproach(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] union = new int[n1 + n2];
        int i = 0;
        int j = 0;

        int k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                if (k == 0 || union[k - 1] != nums1[i]) {
                    union[k++] = nums1[i];

                }
                i++;
            } else {
                if (k == 0 || union[k - 1] != nums2[j]) {
                    union[k++] = nums2[j];

                }
                j++;
            }

        }


        while (i < n1) {
            if (k == 0 || union[k - 1] != nums1[i]) {
                union[k++] = nums1[i];

            }
            i++;
        }


        while (j < n2) {
            if (k == 0 || union[k - 1] != nums2[j]) {
                union[k++] = nums2[j];

            }
            j++;
        }
        return union;
    }


    //Time complexity -> O(n + m) Space -> O(n + m)
    static int[] bruteForce(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set1.add(num);
        }
        int i = 0;
        int[] temp = new int[set1.size()];
        for (int num : set1) {
            temp[i] = num;
            i++;
        }
        return temp;

    }
}
