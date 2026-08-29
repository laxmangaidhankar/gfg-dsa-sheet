public class LongestWord {

    public static void main(String[] args) {
        String[] arr = {"abc", "aaaa"};
        System.out.println(firstApproach(arr));
    }


    //Time Complexity -> O(n) Space Complexity -> O(1)
    static String secondApproach(String[] arr) {
        int max = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                idx = i;
            }
        }

        return arr[idx];
    }

    //First Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static String firstApproach(String[] arr) {
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = Math.max(max, arr[i].length());
                idx = i;
            }
        }
        return arr[idx];
    }
}
