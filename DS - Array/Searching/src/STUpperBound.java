public class STUpperBound {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(optimal(nums, 2));
    }

    static int optimal(int[] nums, int x){
        int n =nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]>x){
                high = mid-1;
            }else{
                low =mid+1;
            }
        }
        return low;
    }

    static int brute(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x) {
                return i;
            }
        }
        return -1;
    }
}
