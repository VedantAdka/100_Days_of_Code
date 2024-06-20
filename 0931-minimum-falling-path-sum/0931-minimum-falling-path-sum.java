class Solution {
    public int minFallingPathSum(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int[] prev=new int[m];
        for(int j=0;j<m;j++){
            prev[j]=a[0][j];
        }
        for(int i=1;i<n;i++){
            int[] curr=new int[m];
            for(int j=0;j<m;j++){
                int u=a[i][j]+prev[j];
                int ld=a[i][j];
                if(j-1>=0){
                    ld+=prev[j-1];
                }
                else{
                    ld+=1e9;
                }
                int rd=a[i][j];
                if(j+1<m){
                    rd+=prev[j+1];
                }
                else{
                    rd+=1e9;
                }
                curr[j]=Math.min(u,Math.min(ld,rd));
            }
            prev=curr;
        }
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            mini=Math.min(mini,prev[j]);
        }
        return mini;
    }
}