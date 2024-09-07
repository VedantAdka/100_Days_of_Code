class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        else{
            String ans=s+s;
            return ans.contains(goal);
        }
    }
}