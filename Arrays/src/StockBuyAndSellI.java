public class StockBuyAndSellI {

    public static void main(String[] args) {
        int[] nums = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }

            if(price-minPrice>maxProfit){
                maxProfit= price-minPrice;
            }
        }
        return maxProfit;
    }

}
