class Solution {
    public int mincnt(int[] f){
        int mini=Integer.MAX_VALUE;
        for(int i:f){
            if(i>0){
                mini=Math.min(mini,i);
            }
        }
        return mini;
    }
    public int maxcnt(int[] f){
        int maxi=Integer.MIN_VALUE;
        for(int i:f){
            maxi=Math.max(maxi,i);
        }
        return maxi;
    }
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                sum+=(maxcnt(freq)-mincnt(freq));
            }
        }
        return sum;
    }
}