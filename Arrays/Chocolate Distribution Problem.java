class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int buy = prices[0];
        for(int i=1;i<n;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else {
                int profit = prices[i] - buy;
                max = Math.max(max,profit);
            }
        }
        return max;
    }
}