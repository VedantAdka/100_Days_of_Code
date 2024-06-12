class Solution {
    public static void f(int i,int[] a,int t,List<Integer> ds, List<List<Integer>> ans){
        if(i==a.length){
            if(t==0){
                ans.add(new ArrayList<Integer> (ds));
            }
            return;
        }
        if(t>=a[i]){
            ds.add(a[i]);
            f(i,a,t-a[i],ds,ans);
            ds.remove(ds.size()-1);
        }
        f(i+1,a,t,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds =new ArrayList<Integer>();
        f(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}