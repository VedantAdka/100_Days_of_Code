class Solution {
    public boolean canJump(int[] nums) {
        int maxind=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            if(i>maxind) return false;
            maxind=Math.max(maxind,i+nums[i]);
        }
        return true;
    }
}