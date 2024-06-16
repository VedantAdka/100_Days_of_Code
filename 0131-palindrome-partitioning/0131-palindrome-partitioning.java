class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> str=new ArrayList<>();
        f(0,s,ans,str);
        return ans;
    }
    public void f(int ind,String s,List<List<String>> ans,List<String> str){
        if(ind==s.length()){
            ans.add(new ArrayList<>(str));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isSafe(s,ind,i)){
                str.add(s.substring(ind,i+1));
                f(i+1,s,ans,str);
                str.remove(str.size()-1);
            }
        }
    }
    public boolean isSafe(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}