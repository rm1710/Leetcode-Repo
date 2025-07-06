import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
     
        String[] words = paragraph.split("\\s+");
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b);
        }

        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        String mostCommon = "";
        int max = 0;

        for (String word : countMap.keySet()) {
            if (countMap.get(word) > max) {
                mostCommon = word;
                max = countMap.get(word);
            }
        }

        return mostCommon;
    }
}
