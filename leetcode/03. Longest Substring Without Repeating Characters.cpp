class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if (s.empty()) return 0;
        
        int cm = 1, tm = 1, len = s.length(), i = 1, j = 0;
        int map[128];
        
        
        for (int mi = 0; mi < 128; ++mi) {
            map[mi] = -1;
        }
        
        map[s[0]] = 0;
        
        for (; i < len; ++i) {
            char cc = s[i];
            
            if (map[cc] == -1 || map[cc] < j) {
                ++cm;
            } else  {
                if (tm < cm) {
                    tm = cm;
                }
                
                j = map[cc] + 1;
                
                int tmp;
                cm = (tmp = (i - map[cc]))  == 0 ? 1 : tmp;
                
                // cout << "met pre-existing char ";
            }
            // cout << " i is " << i << ", and j is now " << j << " cm = " << cm << "\n";
            map[cc] = i;
        }
        
        return tm > cm ? tm : cm;
    }
};
