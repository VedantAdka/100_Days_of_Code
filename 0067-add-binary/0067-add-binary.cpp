class Solution {
public:
    string addBinary(string a, string b) {
        int n=a.length();
        int m=b.length();
        int i=0;
        int c=0;
        string ans="";
        while(i<n || i<m || c!=0){
            int x=0;
            if(i<n && a[n-i-1]=='1'){
                x=1;
            }
            int y=0;
            if(i<m && b[m-i-1]=='1'){
                y=1;
            }
            ans=to_string((x+y+c)%2)+ans;
            c=(x+y+c)/2;
            i++;
        }
        return ans;
    }
};