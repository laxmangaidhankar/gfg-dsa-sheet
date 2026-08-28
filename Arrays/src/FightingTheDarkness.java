public class FightingTheDarkness {
    public static void main(String[] args) {

    }

    public static int firstApproach(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }

}
