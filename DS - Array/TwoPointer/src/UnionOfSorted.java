import java.lang.reflect.Array;
import java.util.*;

public class UnionOfSorted {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        System.out.println(optimal(a, b));

    }


    static ArrayList<Integer> optimal(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < n && j < m) {

            if (a[i] <= b[j]) {
                if (list.size() == 0 || !list.get(list.size() - 1).equals(a[i])) {
                    list.add(a[i]);
                }
                i++;
            } else {
                if (list.size() == 0 || !list.get(list.size() - 1).equals(b[j])) {
                    list.add(b[j]);
                }
                j++;
            }
        }


        while (i < n) {
            if (list.size() == 0 || !list.get(list.size() - 1).equals(a[i])) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (list.size() == 0 || !list.get(list.size() - 1).equals(b[j])) {
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }


    static ArrayList<Integer> better(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }

        while (i < n) {
            list.add(a[i]);
            i++;
        }


        while (j < m) {
            list.add(b[j]);
            j++;
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        return list;
    }


    static ArrayList<Integer> brute(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : set) {
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}
