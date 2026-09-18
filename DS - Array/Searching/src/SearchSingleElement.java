public class SearchSingleElement {

    public static void main(String[] args) {
        int[] nums = {0,1, 1, 2, 2, 6,6};
        System.out.println(better(nums));
    }


    static int better(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n-1; i++) {
            if(i==0){
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }else if(i==n-1){
                if(nums[i]!=nums[i-1]){
                    return nums[i];
                }
            }

            if (nums[i] != nums[i - 1] || nums[i] != nums[i + 1]) {
                 continue;
            }else{
                return nums[i];
            }
        }
        return -1;
    }


    static int brute(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
