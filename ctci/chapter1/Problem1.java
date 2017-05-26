public class Problem1 {

  // Check is String s is unique--contains no duplicate characters
  // This is O(n) runtime, O(1) space using bit vector
  // assumption: each character c in s is in the ascii char set,
  // and c is in lowercase
  public boolean isUnique(String s) {
    int vector = 0;
    
    for (int i = 0; i < s.length(); ++i) {
      int dif = s.charAt(i) - 'a';
      
      if ((vector & (1 << dif) > 0)) return false;
      
      vector |= (1 << dif);
    }
    
    return true;
  }

}
