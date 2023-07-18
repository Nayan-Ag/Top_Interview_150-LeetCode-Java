class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i=1 ; i<dp.length;i++){
            for(int j=0 ; j<coins.length;j++){
                if(coins[j]==i){
                    dp[i] = 1;
                }
                else if(coins[j]<=i){
                    if(dp[i-coins[j]]!=0){
                        if(dp[i]!=0 && (dp[i-coins[j]]+1) < dp[i]){
                            dp[i] = dp[i-coins[j]] + 1;
                        }
                        else if(dp[i]==0){
                            dp[i] = dp[i-coins[j]] + 1;
                        }
                    }
                }
            }
        }
        for(int i=0 ; i<dp.length;i++){
            System.out.print(dp[i] + " ");
        }
        if(dp[amount]==0) return -1;
        return dp[amount];
    }
}