class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int n=a.length();
        int m=b.length();
        int[] prev=new int[m+1];
        for(int j=0;j<=m;j++){
            prev[j]=0;
        }
        for(int i=1;i<=n;i++){
            int[] curr=new int[m+1];
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
            prev=curr;
        }
        return prev[m];
    }
}