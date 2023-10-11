class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int>mpp;
        int max=0;
        int ele;
        for(auto it=nums.begin();it!=nums.end();it++){
            mpp[*it]++;
        }
        for(auto it=nums.begin();it!=nums.end();it++){
            if(mpp[*it]>max){
                max=mpp[*it];
                ele=*it;
            }
        }
        return ele;
        
    }
};