//{ Driver Code Starts
//Initial Template for C++


#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution
{
	public:
		string is_palindrome(int n)
		{
		    int new_dig=0;
		    int x=n;
		    while(n>0){
		        int last_dig=n%10;
		        n/=10;
		        new_dig=new_dig*10+last_dig;
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
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n;
    	cin >> n;
    	Solution ob;
    	string ans = ob.is_palindrome(n);
    	cout << ans <<"\n";
    }
	return 0;
}

// } Driver Code Ends