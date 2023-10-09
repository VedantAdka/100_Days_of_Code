//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
#include <bits/stdc++.h>
class Solution {
  public:
    string armstrongNumber(int n){
        int new_dig=0;
        int x=n;
        while(n>0){
            int last=n%10;
            n/=10;
            new_dig=new_dig+pow(last,3);
        }
        if(new_dig==x){
            return "Yes";
        }
        else{
            return "No";
        }
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        cout << ob.armstrongNumber(n) << endl;
    }
    return 0;
}

// } Driver Code Ends