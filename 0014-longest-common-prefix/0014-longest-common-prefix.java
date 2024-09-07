class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String s1=strs[strs.length-1];
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==s1.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return i==0?"":s.substring(0,i);
    }
}