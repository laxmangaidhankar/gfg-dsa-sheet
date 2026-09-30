public class PowerOf2 {


    public static void main(String[] args) {
        int n = 98;

        System.out.println(optimal(n));
    }


    //O(1) O(1)
    static boolean optimal(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }


    //O(log n) O(1)
    static boolean better(int n) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (Math.pow(2, mid) == n) {
                return true;
            } else if (Math.pow(2, mid) < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }


    //O(n) O(1)
    static boolean brute(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.pow(2, i) == n) {
                return true;
            }
        }
        return false;
    }
}
