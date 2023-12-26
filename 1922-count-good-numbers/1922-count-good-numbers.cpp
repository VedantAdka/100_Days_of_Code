const int MOD = 1e9 + 7;
class Solution {
public:
    int countGoodNumbers(long long n) {
        long long evenCount = (n + 1) / 2;
        long long oddCount = n / 2;

        return (fastPow(5, evenCount) * fastPow(4, oddCount)) % MOD;
    }

private:
    long long fastPow(long long base, long long exponent) {
        long long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
};