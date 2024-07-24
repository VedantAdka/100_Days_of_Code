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
        // int[][] dp=new int[n+1][n+1];
        // int[] pre=new int[n+1];
        // int[] curr=new int[n+1];
        // for(int[] row: dp){
        //     Arrays.fill(row,-1);
        // }
        // return f(0,-1,a);
        //return f(0,-1,a,dp);
        // for(int i=n-1;i>=0;i--){
        //     for(int prev=i-1;prev>=-1;prev--){
        //         int nottake=0+dp[i+1][prev+1];
        //         int take=0;
        //         if(prev==-1 || a[i]>a[prev]){
        //             take=1+dp[i+1][i+1];
        //         }
        //         dp[i][prev+1]=Math.max(nottake,take);
        //     }
        // }
        // return dp[0][-1+1];
        // for(int i=n-1;i>=0;i--){
        //     for(int prev=i-1;prev>=-1;prev--){
        //         int nottake=0+pre[prev+1];
        //         int take=0;
        //         if(prev==-1 || a[i]>a[prev]){
        //             take=1+pre[i+1];
        //         }
        //         curr[prev+1]=Math.max(nottake,take);
        //     }
        //     pre=curr;
        // }
        // return pre[-1+1];
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxi=1;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(a[i]>a[prev]){
                    dp[i]=Math.max(1+dp[prev],dp[i]);
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        return maxi;
    }
}