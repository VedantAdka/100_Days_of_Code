//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution {
  public:
    void printTriangle(int n) {
        int a=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                a=1;
            }
            else{
                a=0;
            }
            for(int j=0;j<=i;j++){
                cout<<a<<" ";
                a=1-a;
            }
            cout<<endl;
            
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
        ob.printTriangle(n);
    }
    return 0;
}
// } Driver Code Ends