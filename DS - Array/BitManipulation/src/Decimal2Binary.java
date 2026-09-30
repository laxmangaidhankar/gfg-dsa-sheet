import com.sun.security.jgss.GSSUtil;

public class Decimal2Binary {

    public static void main(String[] args) {
        int n = 15;
        System.out.println(conversion(n));
    }

    static int conversion(int n) {

        String res = "";

        while (n != 0) {
            if (n % 2 == 1) res += "1";
            else res += "0";
            n /= 2;
        }

        String s = reverse(res);

        return Integer.parseInt(s);
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
