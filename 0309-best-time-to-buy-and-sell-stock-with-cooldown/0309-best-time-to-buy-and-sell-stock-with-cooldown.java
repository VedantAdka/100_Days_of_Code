class Solution {
    public int f(int i,int buy,int[] a){
        if(i>=a.length){
            return 0;
        }
        if(buy==1){
            return Math.max(-a[i]+f(i+1,0,a),0+f(i+1,1,a));
        }
        else{
            return Math.max(a[i]+f(i+2,1,a),0+f(i+1,0,a));
        }
    }
    public int maxProfit(int[] a) {
        int n=a.length;
        int[][] dp=new int[n+2][2];
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                dp[i][1]=Math.max(-a[i]+dp[i+1][0],0+dp[i+1][1]);
                dp[i][0]=Math.max(a[i]+dp[i+2][1],0+dp[i+1][0]);
            }
        }
        return dp[0][1];
        //return f(0,1,a);
    }
}