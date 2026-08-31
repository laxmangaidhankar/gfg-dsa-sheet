import java.util.Arrays;

public class FloorAndCeilInUnsorted {

    public static void main(String[] args) {
        int[] nums = {5, 6, 8, 9, 6, 5, 5, 6};
        System.out.println(Arrays.toString(bruteApproach(nums,7)));
    }

    static int[] bruteApproach(int[] nums, int x) {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= x) {
                floor = Math.max(floor, num);
            }
            if (num >= x) {
                ceil = Math.min(ceil, num);
            }
        }


        if (floor == Integer.MIN_VALUE) floor = -1;
        if (ceil == Integer.MAX_VALUE) ceil = -1;


        return new int[]{floor, ceil};
    }
}
