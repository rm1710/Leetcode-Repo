class Solution {
  public String longestPalindrome(String s) {
    int start = 0, maxLen = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int len : new int[]{extend(s, i, i), extend(s, i, i + 1)}) {
        if (len > maxLen) {
          maxLen = len;
          start = i - (len - 1) / 2;
        }
      }
    }
    return s.substring(start, start + maxLen);
  }

  private int extend(String s, int l, int r) {
    while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
      l--; r++;
    }
    return r - l - 1;
  }
}
