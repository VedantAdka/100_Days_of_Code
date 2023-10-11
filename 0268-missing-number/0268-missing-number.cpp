class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int cnt=0;
        int flag=0;
        for(int i=0;i<=nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(i==nums[j]){
                    flag=1;
                    cnt++;
                    break;
                }
                else{flag=0;}
            }
            if(flag==0){
                    break;
                }
        }
        return cnt;
    }
};