class Solution {
    public int change(int amt, int[] a) {
        int[] prev=new int[amt+1];
        for(int T=0;T<=amt;T++){
            if(T%a[0]==0){
                prev[T]=1;
            }
        }
        for(int ind=1;ind<a.length;ind++){
            int[] curr=new int[amt+1];
            for(int T=0;T<=amt;T++){
                int nottake=prev[T];
                int take=0;
                if(a[ind]<=T){
                    take=curr[T-a[ind]];
                }
                curr[T]=take+nottake;
            }
            prev=curr;
        }
        return prev[amt];
    }
}