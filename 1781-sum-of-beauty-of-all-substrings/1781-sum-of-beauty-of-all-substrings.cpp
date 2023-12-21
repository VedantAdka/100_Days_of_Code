class Solution {
public:
    int beautySum(string s) {
        int n = s.size();
    int totalBeauty = 0;

    for (int i = 0; i < n; ++i) {
        vector<int> frequency(26, 0);

        for (int j = i; j < n; ++j) {
            frequency[s[j] - 'a']++;
            int maxFreq = 0, minFreq = n + 1;

            // Find the maximum and minimum frequencies
            for (int k = 0; k < 26; ++k) {
                if (frequency[k] > 0) {
                    maxFreq = max(maxFreq, frequency[k]);
                    minFreq = min(minFreq, frequency[k]);
                }
            }

            // Update the total beauty for the substring
            totalBeauty += (maxFreq - minFreq);
        }
    }

    return totalBeauty;
    }
};