class Solution {
    public boolean f(int s,boolean[] vis,boolean[] curr,boolean[] cycle,ArrayList<ArrayList<Integer>> adj){
        vis[s]=true;
        curr[s]=true;
        for(Integer it:adj.get(s)){
            if(vis[it]==false){
                if(f(it,vis,curr,cycle,adj)){
                    return cycle[s]=true;
                }
            }
            else if(vis[it]==true && curr[it]==true){
                return cycle[s]=true;
            }
        }
        curr[s]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        int n=graph.length;
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[n];
        boolean[] curr=new boolean[n];
        boolean[] cycle=new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                f(i,vis,curr,cycle,adj);
            }
        }
        for(int i=0;i<n;i++){
            if(cycle[i]==false){
                ans.add(i);
            }
        }
        return ans;
        
    }
}