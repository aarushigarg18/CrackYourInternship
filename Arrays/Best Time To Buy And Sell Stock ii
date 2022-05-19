class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0;
        int sell = 0;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(prices[i] >= prices[i-1]){
                sell++;
            }
            else {
                profit += prices[sell] - prices[buy];
                buy = i;
                sell = i;
            }
        }
        profit += prices[sell] - prices[buy];
        return profit;
    }
}