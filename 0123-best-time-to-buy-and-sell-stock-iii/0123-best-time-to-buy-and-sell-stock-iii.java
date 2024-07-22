class Solution {
    public int f(int i,int buy,int cap,int[] a){
        if(i==a.length || cap==0){
            return 0;
        }
        int profit=0;
        if(buy==0){
            profit=Math.max(-a[i]+f(i+1,1,cap,a),0+f(i+1,0,cap,a));
        }
        else{
            profit=Math.max(a[i]+f(i+1,0,cap-1,a),0+f(i+1,1,cap,a));
        }
        return profit;
    }
    public int maxProfit(int[] a) {
        //return f(0,0,2,a);
        int n=a.length;
        
        int[][][] dp=new int[n+1][2][3];
        for(int i=0;i<=n;i++){
            for(int buy=0;buy<=1;buy++){
                dp[i][buy][0]=0;
            }
        }
        for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=2;cap++){
                dp[n][buy][cap]=0;
            }
        }
        int profit=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=2;cap++){
                    if(buy==0){
                        dp[i][buy][cap]=Math.max(-a[i]+dp[i+1][1][cap],0+dp[i+1][0][cap]);
                    }
                    if(buy==1){
                        dp[i][buy][cap]=Math.max(a[i]+dp[i+1][0][cap-1],0+dp[i+1][1][cap]);
                    }
                }
            }
        }
        return dp[0][0][2];
    }
}