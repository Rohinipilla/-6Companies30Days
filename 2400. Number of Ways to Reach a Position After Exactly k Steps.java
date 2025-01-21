class Solution {
    int mod = 1000000007;
    public int helper(int start,int end,int k,int i,int[][] dp){
        if(i==0){
            if(start == end) return 1;
            else return 0;
        }

        if(Math.abs(end-start)>i) return 0;

        if(dp[start+1000][i] != -1){
            return dp[start+1000][i] % mod;
        }

        int left  =  helper(start-1,end,k,i-1,dp)%mod;
        int right  =  helper(start+1,end,k,i-1,dp)%mod;

        return dp[start+1000][i] = (left+right)%mod;
    }
    public int numberOfWays(int startPos, int endPos, int k) {
        int dp[][] = new int[3000][k+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(startPos,endPos,k,k,dp);
    }
}
