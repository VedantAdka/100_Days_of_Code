class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int r=0;
        while(r<nums.length){
            int cnt=1;
            while(r+1<nums.length && nums[r]==nums[r+1]){
                cnt++;
                r++;
            }
            for(int i=0;i<Math.min(2,cnt);i++){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}