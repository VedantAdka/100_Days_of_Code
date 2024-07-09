class Solution {
    
    public void sortColors(int[] a) {
        int low=0;
        int mid=0;
        int high=a.length-1;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}