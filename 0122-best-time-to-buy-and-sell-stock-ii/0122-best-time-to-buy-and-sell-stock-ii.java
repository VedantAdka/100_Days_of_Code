class Solution {
    public int maxProfit(int[] a) {
        int n=a.length;
        int profit=0;
        int[][] dp=new int[n+1][2];
        dp[n][0]=dp[n][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                if(buy==0){
                    profit=Math.max(-a[i]+dp[i+1][1],0+dp[i+1][0]);
                }
                else{
                    profit=Math.max(a[i]+dp[i+1][0],0+dp[i+1][1]);
                }
                dp[i][buy]=profit;
            }
        }
        return dp[0][0];
    }
}