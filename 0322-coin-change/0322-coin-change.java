class Solution {
    // static int f(int[] coins,int ind,int target,int[][] dp){
    //     if(ind==0){
    //         if(target%coins[0]==0){
    //             return target/coins[0];
    //         }
    //         else{
    //             return Integer.MAX_VALUE;
    //         }
    //     }
    //     if(dp[ind][target]!=-1){
    //         return dp[ind][target];
    //     }
    //     int nottake=0+f(coins,ind-1,target,dp);
    //     int take=Integer.MAX_VALUE;
    //     if(coins[ind]<=target){
    //         take=1+f(coins,ind,target-coins[ind],dp);
    //     }
    //     return dp[ind][target]=Math.min(take,nottake);
    // }
    static int coinChange(int[] coins, int amt) {
    //     int[][] dp=new int[coins.length][amt+1];
    //     for(int t=0;t<=amt;t++){
    //         if(t%coins[0]==0){
    //             dp[0][t]=(t/coins[0]);
    //         }
    //         else {
    //             dp[0][t]=Integer.MAX_VALUE;
    //         }
    //     }
    //     for(int i=1;i<coins.length;i++){
    //         for(int t=0;t<=amt;t++){
    //             int nottake=0+dp[i-1][t];
    //             int take=Integer.MAX_VALUE;
    //             if(coins[i]<=t){
    //                 take=1+dp[i][t-coins[i]];
    //             }
    //             dp[i][t]=Math.min(take,nottake);
    //         }
    //     }
    //     int ans=dp[coins.length-1][amt];
    //     if(ans>=Integer.MAX_VALUE){
    //         return -1;
    //     }
    //     return ans;
    // }
    int[] prev=new int[amt+1];
    int[] cur=new int[amt+1];
    for(int t=0;t<=amt;t++){
        if(t%coins[0]==0){
            prev[t]=(t/coins[0]);
        }
        else {
            prev[t]=(int)1e9;
        }
    }
    for(int i=1;i<coins.length;i++){
        for(int t=0;t<=amt;t++){
            int nottake=0+prev[t];
            int take=(int)1e9;
            if(coins[i]<=t){
                take=1+cur[t-coins[i]];
            }
            cur[t]=Math.min(take,nottake);
        }
        prev=cur;
    }
    int ans=prev[amt];
    if(ans>=(int)1e9){
        return -1;
    }
    return ans;
    // int[][] dp=new int[coins.length][amt+1];
    // for(int row[]:dp){
    //     Arrays.fill(row,-1);
    // }
    // int ans=f(coins,coins.length-1,amt,dp);
    // if(ans>=Integer.MAX_VALUE){
    //     return -1;
    // }
    // return ans;
    }
}