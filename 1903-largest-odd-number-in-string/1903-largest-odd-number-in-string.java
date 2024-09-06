class Solution {
    public String largestOddNumber(String num) {
        int j=num.length()-1;
        while(j>=0){
            if(num.charAt(j)%2==0){
                j--;
            }
            else{
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=j;i++){
            sb.append(num.charAt(i));
        }
        return sb.toString();
    }
}