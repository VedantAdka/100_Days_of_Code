#include <iostream>

class Solution {
public:
    int myAtoi(const std::string& str) {
        int index = 0;
        return recursiveAtoi(str, index);
    }

private:
    int recursiveAtoi(const std::string& str, int& index) {
        // Skip leading whitespaces
        while (index < str.length() && str[index] == ' ') {
            index++;
        }

        // Check for sign
        int sign = 1;
        if (index < str.length() && (str[index] == '+' || str[index] == '-')) {
            sign = (str[index++] == '-') ? -1 : 1;
        }

        // Calculate the result
        long long result = 0;
        while (index < str.length() && isdigit(str[index])) {
            result = result * 10 + (str[index++] - '0');

            // Check for overflow
            if (result * sign > INT_MAX) {
                return INT_MAX;
            } else if (result * sign < INT_MIN) {
                return INT_MIN;
            }
        }

        return static_cast<int>(result * sign);
    }
};