class Solution {
    public int myAtoi(String s) {
        long num = 0;
        char[] a = s.toCharArray();
        int i = 0;
        int sign = 1; // Initialize to 1 for positive numbers
        char current;

        // Skip leading whitespace
        while (i < a.length && a[i] == ' ') {
            i++;
        }

        // Check for sign if any
        if (i < a.length && a[i] == '+') {
            sign = 1;
            i++;
        } else if (i < a.length && a[i] == '-') {
            sign = -1;
            i++;
        }

        // Convert characters to number
        while (i < a.length && a[i] >= '0' && a[i] <= '9') {
            current = a[i];
            num = num * 10 + (current - '0');

            // Check for overflow or underflow
            if (num * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (num * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }

        return (int) (num * sign);
    }
}