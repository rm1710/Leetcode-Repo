import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] result = new int[queries.length];
        Map<Integer, Integer> ballColor = new HashMap<>();  
        Map<Integer, Integer> colorCount = new HashMap<>();  
        int distinctColors = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (ballColor.containsKey(ball)) {
                int prevColor = ballColor.get(ball);
                colorCount.put(prevColor, colorCount.get(prevColor) - 1);
                if (colorCount.get(prevColor) == 0) {
                    distinctColors--;
                }
            }

            ballColor.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            if (colorCount.get(color) == 1) {
                distinctColors++;
            }

            result[i] = distinctColors;
        }

        return result;
    }
}
