
/**
   Problem statement:
   Given 2 strings, s0, s1, return if s0 and s1
   are permutations of one another.

   Runtime: linear in string length
 */

class Problem2 {

    boolean isPerm(String s0, String s1) {
	if (s0.length() != s1.length()) return false;
	
	// Assumption: lowercase ascii charset
	int count[] = new int[128];
	int i = 0;

	for (; i < s0.length(); ++count[s0.charAt(i)], ++i);

	for (i = 0; i < s1.length(); ++i) {
	    if (--count[s1.charAt(i)] < 0) return false;
	}

	return true;
    }

}
