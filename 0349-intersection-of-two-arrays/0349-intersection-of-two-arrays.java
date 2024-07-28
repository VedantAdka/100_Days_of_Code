class Solution {
    public int[] intersection(int[] a, int[] b) {
        Set<Integer> s=new HashSet<>();
        for(int num : a){
            s.add(num);
        }
        Set<Integer> s2=new HashSet<>();
        for(int num : b){
            if(s.contains(num)){
                s2.add(num);
            }
        }
        int[] res=new int[s2.size()];
        int i=0;
        for(int num: s2){
            res[i++]=num;
        }
        return res;
    }
}