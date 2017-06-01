/**
  Problem Statement: Given a string, `s`, modify
  `s` such that `s` is 'urlified': that is, `s` contains %20
  in its original blank spaces. This solution assumes 2k
  spaces are appended to the string passed in, where
  k is the number of original spaces.

  runtime: O(|s|)
  space: O(1)
 */


class Problem3 {

  /**
  @param s: the string to urlify
  @param tlen: the length of the string, excluding spaces allocated at end
  */
  public void urlify(char s[], int tlen) {
    if (s.length == 0) return;

    int charIndex = tlen - 1;
    int blankIndex = s.length - 1;

    for (int i = charIndex; i >= 0; --i) {
      if (s[i] != ' ') {
        s[blankIndex] = s[i];
        --blankIndex;
      } else {
        s[blankIndex] = '0';
        s[--blankIndex] = '2';
        s[--blankIndex] = '%';
        --blankIndex;
      }
    }
  }


}
