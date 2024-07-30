class Solution {
    public void f(int i,int t,int[] a,List<List<Integer>> ans,List<Integer> ds){
        if(i==a.length){
            if(t==0) ans.add(new ArrayList<>(ds));
            return;
        }
        if(t>=a[i]){
            ds.add(a[i]);
            f(i,t-a[i],a,ans,ds);
            ds.remove(ds.size()-1);
        }
        f(i+1,t,a,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        f(0,t,a,ans,new ArrayList<>());
        return ans;
    }
}