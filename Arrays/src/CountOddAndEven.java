public class CountOddAndEven {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(countOddEven(nums));
        ;
    }

    static public int[] countOddEven(int[] nums) {
        // Code here
        int evenCount = 0;
        int oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{oddCount, evenCount};
    }
}
