class Solution {
    public int majorityElement(int[] a) {
        int cnt=0;
        int ele=0;
        for(int i=0;i<a.length;i++){
            if(cnt==0){
                ele=a[i];
                cnt++;
            }
            else if(ele==a[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<a.length;i++){
            if(ele==a[i]){
                cnt1++;
            }
        }
        if(cnt1>a.length/2){
            return ele;
        }
        return -1;
    }
}