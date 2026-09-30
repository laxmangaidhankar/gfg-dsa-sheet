public class SetRightmostUnsetBit {

    public static void main(String[] args) {
        int n = 4;

        System.out.println(optimal(n));

    }


    static int optimal(int n) {
        return n | (n + 1);
    }


    //O(log n) O(log n)
    static int better(int n) {
        StringBuilder binary = new StringBuilder(decToBinaryB(n));

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '0') {
                binary.setCharAt(i, '1');
                return Integer.parseInt(binary.toString(), 2);
            }
        }

        return n | (n + 1);


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
}
