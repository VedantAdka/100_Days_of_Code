class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int[] prev=new int[n];
        for(int i=0;i<n;i++){
            int[] curr=new int[m];
            for(int j=0;j<m;j++){
                if(a[i][j]==1) 
                {   curr[j]=0;
                    continue;
                }
                if(i==0 && j==0)
                {   curr[j]=1;
                    continue;
                }
                int up=0,left=0;
                if(i>0){up=prev[j];}
                if(j>0){left=curr[j-1];}
                curr[j]=up+left;
            }
            prev=curr;
        }
        return prev[m-1];
    }
}