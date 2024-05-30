class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int mprof=0;
        int cost=0;
        int l=0;
        int r=1;
        while(r<len){
            if(prices[l]<prices[r]){
                cost=prices[r]-prices[l];
                mprof=Math.max(mprof,cost);
            }
            else{
                l=r;
            }
            r++;
        }
        return mprof;
    }
}