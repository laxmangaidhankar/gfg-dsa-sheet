import java.util.ArrayList;
import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};

        optimal(a, b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    //O(n+m n log n)
    static void optimal(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = n - 1;
        int j = m - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j--;
            }
        }

        Arrays.sort(a);


    }


    static void better(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i++;

            }
        }
    }


    static void brute(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] temp = new int[n + m];

        int k = 0;
        for (int num : a) {
            temp[k++] = num;
        }

        for (int num : b) {
            temp[k++] = num;
        }


        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }

        for (int i = 0; i < m; i++) {
            b[i] = temp[i];
        }

    }
}
