class Solution {
public:
    vector<int> majorityElement(vector<int>& v) {
    unordered_map<int,int>mpp;
	vector<int>ls;
	int mini=(v.size()/3)+1;
	for(int i=0;i<v.size();i++){
		mpp[v[i]]++;
		if(mpp[v[i]]==mini){
			ls.push_back(v[i]);
		}
	}
	return ls;
    }
};