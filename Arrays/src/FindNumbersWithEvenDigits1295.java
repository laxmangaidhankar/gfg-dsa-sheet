public class FindNumbersWithEvenDigits1295 {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                count++;
            }
        }
        return count;
    }


    static boolean isEven(int num) {
        int digits = findDigits(num);
        return digits % 2 == 0;
    }

    static int findDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
