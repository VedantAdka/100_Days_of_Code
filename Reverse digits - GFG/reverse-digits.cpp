//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
	public:
		long long int reverse_digit(long long int n)
		{
		    long long int new_dig=0;
		    while(n>0){
		        long long int last_dig=n%10;
		        n/=10;
		      //  if(last_dig==0){
		      //      continue;
		      //  }
		        new_dig=new_dig*10+last_dig;
		    }
		    return new_dig;
		}
};

//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	long long int n;
    	cin >> n;
    	Solution ob;
    	long long int  ans = ob.reverse_digit(n);
    	cout << ans <<"\n";
    }
	return 0;
}
// } Driver Code Ends