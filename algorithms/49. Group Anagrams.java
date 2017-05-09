public class Solution {
    
    public String getNormStr(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        int indices = 0;
        Map<String, Integer> norms = new HashMap<String, Integer>();
        List<List<String>> result = new ArrayList<List<String>>();
        
        for (int i = 0; i < strs.length; ++i) {
            String nstr = getNormStr(strs[i]);
            int index;
            
            if (norms.get(nstr) == null) {
                index = indices++;
                
                norms.put(nstr, index);
                result.add(index, new ArrayList<String>());
            } else {
                index = norms.get(nstr);
            }
            
            result.get(index).add(strs[i]);
        }
        
        return result;
    }
}
