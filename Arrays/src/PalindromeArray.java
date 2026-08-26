public class PalindromeArray {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int[] nums) {
        // code here
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] != nums[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
