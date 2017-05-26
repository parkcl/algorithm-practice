public class Solution {
    final String STR_NUMS[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    final int ROM_VALS[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < ROM_VALS.length; ++i) {
            int quotient = num / ROM_VALS[i];
    
            while (num > 0 && quotient > 0) {
                num -= ROM_VALS[i];
                quotient = num / ROM_VALS[i];
                sb.append(STR_NUMS[i]);
            }
        }
        
        return sb.toString();
    }

}
