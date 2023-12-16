#include<bits/stdc++.h>
class Solution {
public:
    bool isIsomorphic(string str1, string str2) {
        if (str1.length() != str2.length()) {
        return false;
    }

    std::unordered_map<char, char> mapping;
    std::unordered_map<char, bool> usedCharacters;

    for (int i = 0; i < str1.length(); ++i) {
        char char1 = str1[i];
        char char2 = str2[i];

        // If char1 is mapped to a different character in str2, or char2 is already mapped, return false
        if (mapping.find(char1) != mapping.end() && mapping[char1] != char2) {
            return false;
        } else if (mapping.find(char1) == mapping.end() && usedCharacters[char2]) {
            return false;
        }

        // Map char1 to char2
        mapping[char1] = char2;
        usedCharacters[char2] = true;
    }

    return true;
    }
};