import java.util.HashMap;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> h = new HashMap<>();

        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        Integer max = null;

        for (int o : h.values()) {
            if (o % 2 == 0) continue;  // Only odd
            for (int e : h.values()) {
                if (e % 2 != 0) continue; // Only even

                int diff = o - e;
                if (max == null || diff > max) {
                    max = diff;
                }
            }
        }

        return max == null ? -1 : max;
    }
}
