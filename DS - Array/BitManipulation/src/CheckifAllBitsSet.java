public class CheckifAllBitsSet {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(better(n));
    }




    public static boolean better(int n) {
        String s = dec2binary(n);

        if (n == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                return false;
            }
        }
        return true;

    }

    static String dec2binary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 1)
                sb.append(1);
            else
                sb.append(0);

            n >>= 1;
        }

        return sb.reverse().toString();
    }


}
