public class Replace0With5 {
    public static void main(String[] args) {
        int n = 1005;
        System.out.println(bruteApproach(n));
    }


    //TC O(d) SC O(1)
    static int optimalApproach(int n) {

        if (n == 0) {
            return 5;
        }

        int result = 0;
        int place = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit == 0) {
                digit = 5;
            }

            result += digit * place;

            place *= 10;
            n /= 10;
        }

        return result;
    }

    //TC O(d) SC O(d)
    static int bruteApproach(int n) {
        String s = String.valueOf(n);

        String str = s.replace('0', '5');

        int num = Integer.parseInt(str);

        return num;

    }
}
