class Solution {
    public int minPathSum(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int[] prev=new int[m];
        for(int i=0;i<n;i++){
            int[] curr=new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0){
                    curr[j]=a[i][j];
                }
                else
                {
                    int up=a[i][j];
                    if(i>0){
                        up+=prev[j];
                    }
                    else{
                        up+=1e9;
                    }
                    int left=a[i][j];
                    if(j>0){
                        left+=curr[j-1];
                    }
                    else{
                        left+=1e9;
                    }
                    curr[j]=Math.min(up,left);
                }
            }
            prev=curr;
        }
        return prev[m-1];
    }
}