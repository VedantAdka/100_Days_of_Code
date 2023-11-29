class Solution {
public:
    int SumofD(vector<int> arr,int d){
        int sum=0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            sum+=ceil((double)arr[i]/(double)d);
        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int low=1;
        int high=*max_element(nums.begin(),nums.end());
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(SumofD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
};