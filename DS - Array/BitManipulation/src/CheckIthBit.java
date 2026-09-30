public class CheckIthBit {

    public static void main(String[] args) {
        int n= 13;
        System.out.println(brute(n, 1));
    }

    static boolean brute(int n, int i) {

        String binary = decimalToBinary(n);

        int index = binary.length() - 1 - i;

        if (index < 0) {
            return false;
        }

        return binary.charAt(index) == '1';
    }


    static String decimalToBinary(int n) {
        String res = "";

        while (n != 0) {
            if (n % 2 == 1) res += "1";
            else res += "0";
            n = n / 2;

        }

        String ans = reverse(res);

        return ans;

    }


    static String reverse(String s) {
        char[] c = s.toCharArray();

        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }

        return new String(c);
    }
}
