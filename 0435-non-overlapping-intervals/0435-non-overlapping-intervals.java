class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int cnt=0;
        Arrays.sort(arr,(a,b)->(a[1]-b[1]));
        int last=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if (arr[i][0] < last) {
                cnt++;
            } 
            else {
                last = arr[i][1];
            }
        }
        return cnt;
    }
}