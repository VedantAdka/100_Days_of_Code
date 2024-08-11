class Solution {
    public void f(ArrayList<ArrayList<Integer>>adj,int s,boolean[] vis){
        vis[s]=true;
        for(Integer it: adj.get(s)){
            if(vis[it]==false){
                f(adj,it,vis);
            }
        }
    }
    public int findCircleNum(int[][] grid) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] vis=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                cnt++;
                f(adj,i,vis);
            }
        }
        return cnt;
    }
}