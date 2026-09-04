public class StockBuyAndSellII {

    public static void main(String[] args) {
        int[] nums = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(optimal(nums));
    }



    //O(n) O(1)
    static int optimal(int[] nums){
        int n=nums.length;

        int maxProfit = 0;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                maxProfit+=nums[i]- nums[i - 1];
            }
        }
        return maxProfit;
    }
}
