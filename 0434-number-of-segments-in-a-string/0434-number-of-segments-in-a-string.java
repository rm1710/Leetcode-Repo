import java.util.regex.*;

class Solution {
    public int countSegments(String s) {
        Pattern p = Pattern.compile("\\S+");
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }
}
