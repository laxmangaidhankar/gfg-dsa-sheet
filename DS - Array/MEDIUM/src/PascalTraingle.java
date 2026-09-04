import java.util.ArrayList;

public class PascalTraingle {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(optimal(n));
    }

    //O(n) O(1)
    static ArrayList<Integer> optimal(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        long value = 1;
        for (int i = 1; i <= n; i++) {
            list.add((int) value);

            value = value * (n - i);
            value = value / i;
        }

        return list;
    }
}
