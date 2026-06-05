class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int max_price = prices[0];
        int max_profit = 0;
        for(int i =0;i<n;i++){
            if(prices[i] < mini){
                mini = prices[i];
            }
            else{
                int profit = prices[i]- mini;
                if(profit > max_profit){
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }
}