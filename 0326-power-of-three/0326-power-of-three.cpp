class Solution {
public:
    int x=0;
    bool isPowerOfThree(int n) {
        if(n<pow(3,x)){
            return false;
        }
        if(n==pow(3,x)){
            return true;
        }
        x++;
        return isPowerOfThree(n);
    };
};