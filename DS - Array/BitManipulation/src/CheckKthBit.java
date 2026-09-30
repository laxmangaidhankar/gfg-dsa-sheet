public class CheckKthBit {

    public static void main(String[] args) {

        System.out.println(optimal(4, 2));
    }


    //O(1) O(1)
    static boolean optimal(int n, int k) {
        return ((n >> k) & 1) == 1; //Right shifting by k moves the bit at position k to position 0, and (n >> k) & 1 checks that bit.
       // return (n & (1<<k))!=0; //Create a mask with 1 at position k, then use AND to check whether bit k in n is also 1.
    }


    //TC -> O(log n)
    //SC -> O(log n)
    static boolean better(int n, int k) {
        String binary = decToBinaryB(n);

        if (k < 0 || k >= binary.length()) {
            return false;
        }

        return binary.charAt(binary.length() - 1 - k) == '1';
    }


    static String decToBinaryB(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 1) sb.append(1);
            else sb.append(0);
            n /= 2;
        }
        return sb.reverse().toString();
    }


    // Time: O(log² n)
    // Space: O(log n)
    static boolean brute(int n, int k) {
        String binary = decToBinary(n);

        if (k < 0 || k >= binary.length()) {
            return false;
        }

        return binary.charAt(binary.length() - 1 - k) == '1';
    }


    static String decToBinary(int n) {
        String res = "";
        while (n > 0) {
            if (n % 2 == 1) res += "1";
            else res += "0";
            n /= 2;
        }

        String rev = reverse(res);


        return rev;

    }

    static String reverse(String s) {
        int low = 0;
        int high = s.length() - 1;

        char[] c = s.toCharArray();

        while (low < high) {
            char temp = c[low];
            c[low] = c[high];
            c[high] = temp;

            low++;
            high--;

        }

        return new String(c);
    }
}
