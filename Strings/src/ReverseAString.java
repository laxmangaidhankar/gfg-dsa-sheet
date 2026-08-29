
public class ReverseAString {
    public static void main(String[] args) {
        String s = "Madam";
        System.out.println(firstApproach(s));

        System.out.println(secondApproach(s));

    }


    //Time Complexity -> O(n) Space Complexity -> O(n)
    static String secondApproach(String s) {
        char[] ch = s.toCharArray();

        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        String str = new String(ch);

        return str;

    }


    //Brute Force Time Complexity -> O(n) Space Complexity -> O(n)
    static String firstApproach(String s) {
        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();

        return rev;
    }
}
