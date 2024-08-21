class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        if (n == 0) return 0;

        // dp[i][j] will be the minimum number of turns to print s[i..j]
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1; // A single character requires 1 turn to print
            for (int j = i + 1; j < n; j++) {
                // Initialize dp[i][j] with printing s[j] after s[i..j-1]
                dp[i][j] = dp[i][j - 1] + 1;
                // Try to find a better solution by merging prints
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + (k + 1 <= j - 1 ? dp[k + 1][j - 1] : 0));
                    }
                }
            }
        }

        return dp[0][n - 1];
    }
}
