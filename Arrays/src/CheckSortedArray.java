public class CheckSortedArray {

    public static void main(String[] args) {
        int[] nums ={10,23,121};
        System.out.println(isSorted(nums));
    }

    public static boolean isSorted(int[] nums){
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
