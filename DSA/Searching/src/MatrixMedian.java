import java.util.Arrays;

public class MatrixMedian {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 5, 7, 9, 11},
                {2, 3, 4, 5, 10},
                {9, 10, 55, 14, 16}
        };
        System.out.println(optimal(mat));
    }


    public static int optimal(int[][] mat) {
        int[] minmax = findMinMax(mat);
        int low = minmax[0];
        int high = minmax[1];

        int n = mat.length;
        int m = mat[0].length;

        int req = (n * m) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallEqual = smallEqualElement(mat, mid, n, m);

            if (smallEqual <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int smallEqualElement(int[][] mat, int val, int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += upperBound(mat[i], val, m);
        }
        return count;
    }

    public static int upperBound(int[] row, int val, int m) {
        int low = 0;
        int high = m - 1;
        int ans = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] > val) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] findMinMax(int[][] mat) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = mat.length;
        int m = mat[0].length;

        // Fix: Check only 1st and last columns in O(N)
        for (int i = 0; i < n; i++) {
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][m - 1]);
        }

        return new int[]{min, max};
    }


    //O((N * M) log(N * M)).
    public static int findMedian(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int[] nums = new int[n * m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[index++] = mat[i][j];
            }
        }

        Arrays.sort(nums);
        return nums[(n * m) / 2];


    }


    public static int check(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Correct array sizing for N x M matrix
        int[] nums = new int[n * m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[k++] = mat[i][j];
            }
        }

        Arrays.sort(nums);

        // Direct lookup of the middle index
        return nums[(n * m) / 2];
    }
}
