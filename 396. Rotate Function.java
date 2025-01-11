class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        int sum =0,f0 = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            f0 = f0 + (i*nums[i]); 
        }

        int[] dp = new int[n];
        dp[0] = f0;
        int res = dp[0];

        for(int i=1;i<n;i++){
            dp[i] = dp[i-1]+sum-(n*nums[n-i]);
            res = Math.max(res,dp[i]);
        }

        return res;
    }
}
