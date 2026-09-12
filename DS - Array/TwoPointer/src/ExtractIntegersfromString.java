import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ExtractIntegersfromString {
    public static void main(String[] args) {
        String s = "1: Geeks for geeks, 2: geeksforgeeks, 3: forGeeksgeeks 56";

        System.out.println(better(s));

    }

    //O(n^2) O(k)
    static ArrayList<String> brute(String s) {
        ArrayList<String> list = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                String num = "";

                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num + s.charAt(i);
                    i++;
                }
                list.add(num);
            }


        }
        return list;

    }


    //O(n)  Worst Case -> O(n)  Best Case -> Space O(k + m)
    static ArrayList<String> better(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        return list;
    }
}
