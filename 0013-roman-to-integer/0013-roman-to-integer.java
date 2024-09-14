class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        char[] a=s.toCharArray();
        int n=a.length;
        int sum=m.get(a[n-1]);
        for(int i=n-2;i>=0;i--){
            if(m.get(a[i])>=m.get(a[i+1])){
                sum+=m.get(a[i]);
            }
            else{
                sum-=m.get(a[i]);
            }
        }
        return sum;
    }
}