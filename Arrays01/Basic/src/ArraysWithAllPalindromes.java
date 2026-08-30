public class ArraysWithAllPalindromes {

    public static void main(String[] args) {
        int[] nums = {111, 222, 333, 444, 555};
        System.out.println(checkPalindrome(nums));

    }


    //TC O(n) SC O(1)
    static boolean checkPalindrome(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (!isPalindrome(nums[i])) {
                return false;
            }
        }
        return true;

    }


    static boolean isPalindrome(int n) {

        int originalNum = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse == originalNum;
    }
}
