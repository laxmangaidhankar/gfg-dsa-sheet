public class Binary2Decimal {

    public static void main(String[] args){
        String s = "1100";
        System.out.println(conversion(s));
    }

    static int conversion(String str) {
        int num = 0;
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                num += (int) Math.pow(2, n - 1 - i);
            }
        }

        return num;
    }
}
