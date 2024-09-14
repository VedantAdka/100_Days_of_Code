class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int maxi=Integer.MIN_VALUE;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                cnt++;
            }
            else if(ch==')'){
                cnt--;
            }
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
}