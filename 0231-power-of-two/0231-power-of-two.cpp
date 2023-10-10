class Solution {
public:
    int x=0;
    bool isPowerOfTwo(int n) {
        if(n<pow(2,x)){
            return false;
        }
        if(n==pow(2,x)){
            return true;
        }
        x++;
        return isPowerOfTwo(n);
    }
};