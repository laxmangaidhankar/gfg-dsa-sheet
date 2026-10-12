public class ReverseStringwithSpacesIntact {
    public static void main(String[] args) {
        String s = "Help others";
        System.out.println(better(s));
    }


    static String brute(String s) {
        int n = s.length();
        StringBuilder charsOnly = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ') {
                charsOnly.append(s.charAt(i));
            }
        }
        int charIdx = charsOnly.length() - 1;
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                result[i] = ' ';
            } else {
                result[i] = charsOnly.charAt(charIdx);
                charIdx--;
            }
        }
        return new String(result);

    }


    //O(n) O(n)
    static String better(String s) {
        int n = s.length();
        char[] temp = s.toCharArray();

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (temp[left] == ' ') {
                left++;
            } else if (temp[right] == ' ') {
                right--;
            } else {
                char c = temp[left];
                temp[left] = temp[right];
                temp[right] = c;
                left++;
                right--;
            }
        }
        return new String(temp);
    }
}
