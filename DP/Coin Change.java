class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = minimum(coins,amount,dp);
        return (ans == (int)1e9)?-1:ans;
    }
    
    public int minimum(int[] coins,int tar,int[] dp){
        if(tar == 0){
            return dp[tar] = 0;
        }
        
        if(dp[tar] != -1){
            return dp[tar];
        }
        
        int min = (int)1e9;
        for(int coin : coins){
            if(tar - coin >= 0){
                min = Math.min(min,minimum(coins,tar-coin,dp)+1);
            }
        }
        return dp[tar] = min;
    }
}