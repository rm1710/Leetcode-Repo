class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Start with the first array's min and max values.
        int firstMin = arrays.get(0).get(0);
        int firstMax = arrays.get(0).get(arrays.get(0).size() - 1);

        // Initialize the result to zero.
        int maxDist = 0;

        // Iterate through the remaining arrays.
        for (int i = 1; i < arrays.size(); i++) {
            // Get the current array's min and max values.
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);

            // Calculate distances:
            // 1. From the current array's max to the first array's min.
            // 2. From the current array's min to the first array's max.
            maxDist = Math.max(maxDist, Math.abs(currentMax - firstMin));
            maxDist = Math.max(maxDist, Math.abs(firstMax - currentMin));

            // Update the first array's min and max with the overall min and max so far.
            firstMin = Math.min(firstMin, currentMin);
            firstMax = Math.max(firstMax, currentMax);
        }

        return maxDist;
    }
}
