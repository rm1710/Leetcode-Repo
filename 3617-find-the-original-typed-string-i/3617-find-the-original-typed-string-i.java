import java.util.*;

class Solution {
    public int possibleStringCount(String word) {
        Set<String> result = new HashSet<>();
        result.add(word);

        int n = word.length();

        for (int i = 0; i < n; ) {
            int j = i + 1;

            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }

            int blockLength = j - i;

            for (int k = 1; k < blockLength; k++) {
                String newWord = word.substring(0, i) + word.substring(i + k);
                result.add(newWord);
            }

            i = j; 
        }

        return result.size();
    }
}
