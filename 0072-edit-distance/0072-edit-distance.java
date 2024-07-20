class Solution {
    public int f(int i,int j,String s,String t){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(s.charAt(i)==t.charAt(j)){
            return f(i-1,j-1,s,t);
        }
        else{
            return (1+Math.min(f(i-1,j,s,t),Math.min(f(i,j-1,s,t),f(i-1,j-1,s,t))));
        }
    }
    public int minDistance(String s, String t) {
        int n=s.length();
        int m=t.length();
        //return f(n-1,m-1,s,t);
        int[][] dp=new int[n+1][m+1];
        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
        // int[] prev=new int[m+1];
        // int[] curr=new int[m+1];
        // for(int j=0;j<=m;j++){
        //     prev[j]=j;
        // }
        // for(int i=1;i<=n;i++){
        //     curr[0]=i;
        //     for(int j=1;j<=m;j++){
        //         if(s.charAt(i-1)==t.charAt(j-1)){
        //             curr[j]=prev[j-1];
        //         }
        //         else{
        //             curr[j]=1+Math.min(prev[j],Math.min(curr[j-1],prev[j-1]));
        //         }
        //     }
        //     prev=curr;
        // }
        // return prev[m];
    }
}