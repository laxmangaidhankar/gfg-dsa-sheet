import java.util.List;

public class BalancedArray {
    public static void main(String[] args) {

    }

    public int minValueToBalance(List<Integer> nums) {

        int count = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.size() / 2; i++) {
            leftSum += nums.get(i);
        }

        for (int i = nums.size() / 2; i < nums.size(); i++) {
            rightSum += nums.get(i);
        }


        return Math.abs(leftSum - rightSum);
    }
}
