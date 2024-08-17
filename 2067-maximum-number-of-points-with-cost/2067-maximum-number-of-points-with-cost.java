class Solution {
    public long maxPoints(int[][] points) {
        int cols = points[0].length;
        long[] dp = new long[cols];
        
        for (int[] row : points) {
            long[] newDp = new long[cols];
            long leftMax = 0, rightMax = 0;

            // Left to right
            for (int col = 0; col < cols; ++col) {
                leftMax = Math.max(leftMax - 1, dp[col]);
                newDp[col] = leftMax;
            }

            // Right to left
            for (int col = cols - 1; col >= 0; --col) {
                rightMax = Math.max(rightMax - 1, dp[col]);
                newDp[col] = Math.max(newDp[col], rightMax) + row[col];
            }

            dp = newDp;
        }

        long maxPoints = 0;
        for (long pointsAtCol : dp) {
            maxPoints = Math.max(maxPoints, pointsAtCol);
        }

        return maxPoints;
    }
}
