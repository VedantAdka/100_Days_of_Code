class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int x:a){
            sum2+=x;
        }
        return sum1-sum2;
    }
}