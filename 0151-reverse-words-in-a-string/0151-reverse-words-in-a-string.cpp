class Solution {
public:
    string reverseWords(string s) {
        std::istringstream iss(s);
        std::vector<std::string> words;

        // Tokenize the string into words
        while (iss >> s) {
            words.push_back(s);
        }

        // Reconstruct the string with reversed words
        s = "";
        for (auto it = words.rbegin(); it != words.rend(); ++it) {
            s += *it;
            if (it + 1 != words.rend()) {
                s += " ";
            }
        }

        return s;
    }
};