class Solution {
public:

    int strStr(string haystack, string needle) {
        if ((haystack.size() == 0 && needle.size() == 0) || needle.size() == 0) return 0;
        if (haystack.size() < needle.size()) return -1;
        
        int hlen = haystack.size(), nlen = needle.size();
        int scanIndex = -1, resIndex = -1;
        int i = 0;
        
        for (; i < hlen; ++i) {
            char hc = haystack[i];
            
            if (hc == needle[0] && i + nlen <= hlen) {
                bool isFound = 1;
                int k = 0;
                
                for (int j = i + 1; j < i + nlen; ++j) {
                    isFound &= (haystack[j] == needle[++k]);
                }
                
                if (isFound) return i;
            }
            
        }
        
        return -1;
    }
};
