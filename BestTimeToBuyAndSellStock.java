// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = profit(prices[i],prices[j]);
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    
    private int profit(int buyingPrice,int sellingPrice){
        return sellingPrice-buyingPrice;
    }
}
