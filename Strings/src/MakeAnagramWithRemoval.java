public class MakeAnagramWithRemoval {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbd";
        System.out.println(firstApproach(s1, s2));
    }

    static int firstApproach(String s1, String s2) {

        boolean[] used = new boolean[s2.length()];
        int common = 0;

        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {

                if (!used[j] && s1.charAt(i) == s2.charAt(j)) {
                    used[j] = true;
                    common++;
                    break;
                }
            }
        }

        return s1.length() + s2.length() - (2 * common);

    }
}
