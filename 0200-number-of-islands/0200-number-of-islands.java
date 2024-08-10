class Solution {
    public boolean isValid(int i,int j,int n,int m,char[][]grid){
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]=='1'){
            return true;
        }
        else return false;
    }
    public void numIslands_rec(int i,int j,int n,int m,char[][]grid){
        grid[i][j]='0';
        if(isValid(i+1,j,n,m,grid)){
            numIslands_rec(i+1,j,n,m,grid);
        }
        if(isValid(i-1,j,n,m,grid)){
            numIslands_rec(i-1,j,n,m,grid);
        }
        if(isValid(i,j+1,n,m,grid)){
            numIslands_rec(i,j+1,n,m,grid);
        }
        if(isValid(i,j-1,n,m,grid)){
            numIslands_rec(i,j-1,n,m,grid);
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    numIslands_rec(i,j,n,m,grid);
                }
            }
        }
        return ans;
    }
}