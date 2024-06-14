class Solution {
    public void f(int ind, int[] a, List<List<Integer>> ans){
        if(ind==a.length){
            List<Integer> ds=new ArrayList<Integer>();
            for(int i=0;i<a.length;i++){
                ds.add(a[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<a.length;i++){
            swap(i,ind,a);
            f(ind+1,a,ans);
            swap(i,ind,a);
        }
    }
    public void swap(int i,int j,int[] a){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        f(0,nums,ans);
        return ans;
    }
}