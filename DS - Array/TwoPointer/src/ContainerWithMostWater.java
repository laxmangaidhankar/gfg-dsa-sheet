public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 3};
        System.out.println(optimal(nums));
    }

    static int optimal(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        int maxArea = 0;
        while (left < right) {
            int height = Math.min(nums[left], nums[right]);
            int width = right - left;

            maxArea = Math.max(maxArea, height * width);

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    static int brute(int[] nums) {
        int n = nums.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int height = Math.min(nums[i], nums[j]);
                int width = j - i;


                maxArea = Math.max(maxArea, width * height);
            }
        }
        return maxArea;
    }
}
