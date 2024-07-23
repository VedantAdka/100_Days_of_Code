class Solution {
    public int maxProfit(int[] a, int fee) {
        int n=a.length;
        int[][] dp=new int[n+1][2];
        for(int i=n-1;i>=0;i--){
            dp[i][1]=Math.max(-a[i]+dp[i+1][0],0+dp[i+1][1]);
            dp[i][0]=Math.max(a[i]+dp[i+1][1]-fee,0+dp[i+1][0]);
            // for(int buy=0;buy<=1;buy++){
            //     if(buy==1){
            //         dp[i][buy]=Math.max(-a[i]+dp[i+1][0],0+dp[i+1][1]);
            //     }
            //     else{
            //         dp[i][buy]=Math.max(a[i]+dp[i+1][1]-fee,0+dp[i+1][0]);
            //     }
            // }
        }
        return dp[0][1];
    }
}