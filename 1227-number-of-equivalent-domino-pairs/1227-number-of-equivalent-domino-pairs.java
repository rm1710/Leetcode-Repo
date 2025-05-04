class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        int[] count = new int[100]; 
        int totalPairs = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];

            int key;
            if (a < b) {
                key = a * 10 + b;
            } else {
                key = b * 10 + a;
            }

            totalPairs += count[key];

            count[key]++;
        }

        return totalPairs;
    }
}
