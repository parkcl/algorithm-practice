/**
  Problem statement: given input vector, nums, return indices 
  of the two numbers such that they add up to a specific target.
 */
 
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> intLookupTable;
      
	    int index = -1; 
	    for (vector<int>::const_iterator i = nums.begin(); i != nums.end(); ++i)
            intLookupTable[*i] = ++index;

	    index = 0;
	    for (vector<int>::const_iterator i = nums.begin(); i != nums.end(); ++i) {
            int diffTarg = target - *i;
            
            // if there exists a B such that B = target - nums[i] 
            if (intLookupTable.find(diffTarg) == intLookupTable.end()) {
            } else if (intLookupTable.at(diffTarg) != index){
                int otherIndex = intLookupTable.at(diffTarg);
                vector<int> result;
                
                if (otherIndex < index) {
                    result = {otherIndex, index};
                } else {
                    result = {index, otherIndex};
                }
                
                return result;
            }
	    ++index;
        }
        
        vector<int> empty;
        return empty;
    }
};
