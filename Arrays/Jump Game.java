class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        return jumps(nums,0,n-1,dp);
    }
    
    public boolean jumps(int[] nums,int SI,int ei,boolean[] dp){
        for(int si=ei;si>=SI;si--){
            if(si == ei){
                dp[si] = true;
                continue;
            }
        
        
        
        boolean ans = false;
        for(int jumps=1;jumps<=nums[si];jumps++){
            if(si+jumps <= ei){
                ans = ans || dp[si+jumps];
                if(ans){
                    dp[si] = true;
                    break;
                }
            }
        }
            dp[si]=ans;
        }
        return dp[SI];
    }
}