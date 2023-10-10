class Solution {
public:
    int cnt=0;
    bool isPowerOfFour(int n) {
        if(n<pow(4,cnt)){
            return false;
        }
        if(n==pow(4,cnt)){
            return true;
        }
        cnt++;
        return isPowerOfFour(n);
    }
};