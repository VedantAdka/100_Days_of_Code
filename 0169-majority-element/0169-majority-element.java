class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele){
                cnt++;
            }
            else if(cnt==0){
                ele=nums[i];
            }
            else{
                cnt--;
            }
        }
        return ele;
    }
}