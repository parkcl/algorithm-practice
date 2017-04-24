/**
  Problem statement: given input array 'nums', find set of triplets
  such that for each triple t = (a, b, c), sum(t) = 0.
 */

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int a = nums[i], tsum = -a, 
			    lo = i + 1, hi = nums.length - 1;
			int b, c;

			while (lo < hi) {
				b = nums[lo];
				c = nums[hi];

				if (b + c == tsum) {
					res.add(Arrays.asList(a, b, c));

					while (lo < hi && nums[lo] == nums[lo + 1]) {
						lo++;
					}
					while (lo < hi && nums[hi] == nums[hi - 1]) {
						hi--;
					}
					
					lo++;
					hi--;
				} else if (b + c < tsum) {
					// too small
					lo++;
				} else {
					// too big
					hi--;
				}

			}

		}

		return res;
	}    
}
