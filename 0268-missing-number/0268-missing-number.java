class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=a[i];
        }
        return sum-sum2 ;
    }
}