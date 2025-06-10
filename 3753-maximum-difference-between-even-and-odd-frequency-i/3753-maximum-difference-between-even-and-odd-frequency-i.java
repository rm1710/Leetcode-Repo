import java.util.HashMap;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> h = new HashMap<>();

        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        int max = 0;

        for (int o : h.values()) {
            if (o % 2 == 0) continue;  
            for (int e : h.values()) {
                if (e % 2 != 0) continue; 

                int d = o - e;
                if (d>max  || max==0) {
                    max = d;
                }
            }
        }

        return max == 0 ? -1 : max;
    }
}
