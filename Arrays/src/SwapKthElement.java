import java.util.List;

public class SwapKthElement {
    public static void main(String[] args) {

    }

    public void swapKth(List<Integer> nums, int k) {
        // code here
        int temp = nums.get(k - 1);
        nums.set(k - 1, nums.get(nums.size() - k));
        nums.set(nums.size() - k, temp);

    }
}
