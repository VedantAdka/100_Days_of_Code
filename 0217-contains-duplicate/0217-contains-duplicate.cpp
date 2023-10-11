class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int>mpp;
        int flag=0;
        for(auto it=nums.begin();it!=nums.end();it++){
            mpp[*it]++;
        }
         for(auto it=nums.begin();it!=nums.end();it++){
            if(mpp[*it]>=2){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
};