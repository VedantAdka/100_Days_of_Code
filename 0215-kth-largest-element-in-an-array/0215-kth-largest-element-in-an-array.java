class Solution {
    public int findKthLargest(int[] a, int k) {
        // HashMap<Integer,Integer> large=new HashMap<>();
        // for(int i=1;i<=k;i++){
        //     int maxi=Integer.MIN_VALUE;
        //     for(int j=0;j<a.length;j++){
        //         if(maxi<a[j] && !large.containsKey(a[j])){
        //             maxi=a[j];
        //         }
        //     }
        //     large.put(maxi,i);
        // }
        // return large.get(large.size());
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:a){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}