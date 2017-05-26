public class Solution {
    Map<String, Integer> romMap = new HashMap<>();

    public void createRomMap() {
    	romMap.put("M", 1000);
    	romMap.put("CM", 900);
    	romMap.put("D", 500);
    	romMap.put("CD", 400);
    	romMap.put("C", 100);
    	romMap.put("XC", 90);
    	romMap.put("L", 50);
    	romMap.put("XL", 40);
    	romMap.put("X", 10);
    	romMap.put("IX", 9);
    	romMap.put("V", 5);
    	romMap.put("IV", 4);
    	romMap.put("I", 1);
    }

    
    
    public int romanToInt(String s) {
    	createRomMap();
    	int sum = 0;
    	
    	for (int i = 0; i < s.length(); ++i) {
    	    if (i + 2 <= s.length() && romMap.get(s.substring(i, i + 2)) != null) {
    		    sum += romMap.get(s.substring(i, i + 2));
    		    ++i;
    	    } else {
    		sum += romMap.get(s.charAt(i) + "");
    	    }
    	}
    
    	return sum;
    }

}
