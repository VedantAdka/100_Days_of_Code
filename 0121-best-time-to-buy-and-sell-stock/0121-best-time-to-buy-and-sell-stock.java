class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min_val=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min_val;
            if(cost<0){
                min_val=Math.min(min_val,prices[i]);
            }
            else{
                profit=Math.max(profit,cost);
            }
        }
        return profit;
    }
}