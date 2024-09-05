class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map<Integer,Integer> m=new HashMap<>();
        // int[] ans={-1,-1};
        // for(int i=0;i<nums.length;i++){
        //     if(m.containsKey(target-nums[i])){
        //         ans[0]=i;
        //         ans[1]=m.get(target-nums[i]);
        //         return ans;
        //     }
        //     else{
        //         m.put(nums[i],i);
        //     }
        // }
        // return ans;
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer> a=new ArrayList<>();
        for(int x: nums){
            a.add(x);
        }
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]>target){
                r--;
            }
            else if(nums[l]+nums[r]<target){
                l++;
            }
            else{
                ans[0]=a.indexOf(nums[l]);
                ans[1]=a.lastIndexOf(nums[r]);
                break;
            }
        }
        return ans;
    }
}