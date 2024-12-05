import java.util.regex.*;
class Solution {
    public int strStr(String haystack, String needle) {
        Pattern pattern = Pattern.compile(needle);

        Matcher match= pattern.matcher(haystack);

        if(match.find()) {
            return match.start();
        }
        return -1;
    }
}