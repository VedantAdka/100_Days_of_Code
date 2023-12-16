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
        if (mapping.find(char1) != mapping.end() && mapping[char1] != char2) {
            return false;
        } else if (mapping.find(char1) == mapping.end() && usedCharacters[char2])         {
            return false;
        }
        mapping[char1] = char2;
        usedCharacters[char2] = true;
    }

    return true;
    }
};