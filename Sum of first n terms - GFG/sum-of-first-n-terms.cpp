//{ Driver Code Starts
// Initial template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++

class Solution {
  public:
  long long sum=0;
  long long cnt=1;
    long long sumOfSeries(long long N) {
        if(cnt>N){
            return sum;
        }
        sum+=(cnt*cnt*cnt);
        cnt++;
        sumOfSeries(N);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long N;
        cin >> N;
        Solution ob;
        cout << ob.sumOfSeries(N) << "\n";
    }
}
// } Driver Code Ends