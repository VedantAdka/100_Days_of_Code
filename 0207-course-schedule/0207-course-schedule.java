class Solution {
    public boolean f(int s,boolean[] vis,boolean[] curr,ArrayList<ArrayList<Integer>>adj){
        vis[s]=true;
        curr[s]=true;
        for(Integer it: adj.get(s)){
            if(vis[it]==false){
                if(f(it,vis,curr,adj)){
                    return true;
                }
            }
            else if(vis[it]==true && curr[it]==true){
                return true;
            }
        }
        curr[s]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] data: prerequisites){
            int u=data[0];
            int v=data[1];
            adj.get(u).add(v);
        }
        boolean[] vis=new boolean[numCourses];
        boolean[] curr=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==false){
                if(f(i,vis,curr,adj)){
                    return false;
                }
            }
        }
        return true;
    }
}