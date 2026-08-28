import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(bruteForce(n));
    }

    //Time Complexity -> O(n) Space Complexity -> O(n)
    static ArrayList<Integer> optimalApproach(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        long value = 1;
        for (int k = 0; k < n; k++) {
            ans.add((int) value);
            value = value * (n - 1 - k) / (k + 1);
        }

        return ans;
    }


    //Brute Force Time Complexity -> O(n^2) Space Complexity -> O(n)
    static ArrayList<Integer> bruteForce(int n) {
        ArrayList<Integer> prev = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            ArrayList<Integer> current = new ArrayList<>();

            current.add(1);

            for (int j = 1; j < i; j++) {
                current.add(prev.get(j - 1) + prev.get(j));
            }

            if (i > 0) {
                current.add(1);
            }
            prev = current;
        }

        return prev;
    }
}
