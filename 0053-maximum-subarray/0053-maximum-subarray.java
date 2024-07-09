class Solution {
    public int maxSubArray(int[] a) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=a[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}