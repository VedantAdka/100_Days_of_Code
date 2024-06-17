class Solution {
    public int f(int[] a){
        int n=a.length;
        int prev=a[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int take=a[i];
            if(i>1){
                take+=prev2;
            }
            int nontake=0+prev;
            int curi=Math.max(take,nontake);
            prev2=prev;
            prev=curi;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int[] a=new int[nums.length-1];
        int[] b=new int[nums.length-1];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            a[i]=nums[i];
            b[i]=nums[i+1];
        }
        int ans=Math.max(f(a),f(b));
        return ans;
    }
}