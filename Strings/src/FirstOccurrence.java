public class FirstOccurrence {
    public static void main(String[] args) {
        String txr = "ABCDE";
        String par = "CD";

        System.out.println(secondApproach(txr, par));
    }

    static int secondApproach(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }


    static int firstApproach(String txr, String pat) {
        int n = txr.length();
        int m = pat.length();


        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {
                if (txr.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
