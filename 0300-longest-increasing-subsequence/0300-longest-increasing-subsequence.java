class Solution {
    // public int f(int i,int prev,int[] a){
    //     if(i==a.length){
    //         return 0;
    //     }
    //     int nottake=0+f(i+1,prev,a);
    //     int take=0;
    //     if(prev==-1 || a[i]>a[prev]){
    //         take=1+f(i+1,i,a);
    //     }
    //     return Math.max(take,nottake);
    // }
    public int f(int i,int prev,int[] a,int[][] dp){
        if(i==a.length){
            return 0;
        }
        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int nottake=0+f(i+1,prev,a,dp);
        int take=0;
        if(prev==-1 || a[i]>a[prev]){
            take=1+f(i+1,i,a,dp);
        }
        return dp[i][prev+1]=Math.max(take,nottake);
    }
    public int lengthOfLIS(int[] a) {
        int n=a.length;
        int[][] dp=new int[n][n+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        // return f(0,-1,a);
        return f(0,-1,a,dp);
    }
}