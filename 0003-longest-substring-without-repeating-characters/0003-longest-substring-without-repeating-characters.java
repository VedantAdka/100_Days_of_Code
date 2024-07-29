class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=0;
        int cnt=0;
        int i=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                maxi=Math.max(maxi,cnt);
                cnt=0;
                i=map.get(s.charAt(i))+1;
                map.clear();
            }
            else{
                map.put(s.charAt(i),i);
                cnt++;
                if(i==s.length()-1){
                    maxi=Math.max(maxi,cnt);
                }
                i++;
            }
        }
        return maxi;
    }
}