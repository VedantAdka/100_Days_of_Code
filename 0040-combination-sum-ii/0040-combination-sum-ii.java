class Solution {
    public static void f(int ind,int[] a,int t,List<Integer> ds,List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<a.length;i++){
            if(i>ind && a[i]==a[i-1]) continue;
            if(t<a[i]) break;
            ds.add(a[i]);
            f(i+1,a,t-a[i],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        f(0,candidates,target,new ArrayList<Integer>(),ans);
        return ans;
    }
}