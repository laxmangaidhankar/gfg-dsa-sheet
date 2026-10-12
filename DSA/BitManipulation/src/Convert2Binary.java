import java.util.Arrays;

public class Convert2Binary {

    public static void main(String[] args) {
        int n = 13;
        System.out.println(convert2Binary(n));
    }


    //Decimal 2 Binary
    static int convert2Binary(int n) {
        String res = "";

        while (n != 0) {
            if (n % 2 == 1) res += '1';
            else res += '0';
            n = n / 2;
        }

        reverse(res);

        return Integer.parseInt(res);

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
