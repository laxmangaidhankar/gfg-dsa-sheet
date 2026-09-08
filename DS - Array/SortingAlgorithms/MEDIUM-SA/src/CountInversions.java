public class CountInversions {

    public static void main(String[] args) {
        int[] nums = {10, 10, 10};
        System.out.println(brute(nums));
    }



    //Brute Force
    //O(n^2)
    //O(1)
    static int brute(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && nums[i] > nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
