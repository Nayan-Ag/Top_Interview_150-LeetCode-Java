class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[n-1] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            if(i==n-2){
                dp[i] = Math.max(nums[n-1] , nums[n-2]);
            }
            else {
                dp[i] = Math.max(dp[i+1] , (nums[i] + dp[i+2]));
            }
        }
        return dp[0];
    }
}