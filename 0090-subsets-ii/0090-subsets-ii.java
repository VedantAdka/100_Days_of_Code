class Solution {
    public void f(int ind,int[] a,List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<a.length;i++){
            if(i!=ind && a[i]==a[i-1]) continue;
            ds.add(a[i]);
            f(i+1,a,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        f(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}