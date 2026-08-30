public class SumOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(optimalApproach(nums));
    }

    //TC O(n) SC O(1)
    static int optimalApproach(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
