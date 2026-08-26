public class CountSmallerInArray {

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 8, 4, 5};
        int x =9;
        System.out.println(smaller(nums,x));
    }

    static int smaller(int[] nums, int x){
        int count =0;
        for(int num:nums){
            if(num<=x){
                count++;
            }
        }
        return count;
    }
}
