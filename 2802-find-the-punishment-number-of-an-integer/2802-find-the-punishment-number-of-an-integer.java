public class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(Integer.toString(square), 0, i, 0)) {
                ans += square;
            }
        }
        return ans;
    }

    private boolean canPartition(String s, int index, int target, int sum) {
        if (index == s.length()) return sum == target;

        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0'); // Convert substring to number
            if (num + sum > target) break; // Stop early if sum exceeds target
            if (canPartition(s, j + 1, target, sum + num)) return true;
        }
        return false;
    }
}
