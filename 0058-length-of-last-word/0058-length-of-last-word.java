class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int len=0;
        while(s.charAt(i)==' '){
            i-=1;
        }
        while(i>=0 && s.charAt(i)!=' '){
            len+=1;
            i-=1;
        }
        return len;
    }
}