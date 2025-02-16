class Solution {
    public int[] constructDistancedSequence(int n) {
        int len = 2 * n - 1;
        int[] res = new int[len];
        boolean[] used = new boolean[n + 1];

        fill(res, used, 0, n);
        return res;
    }

    private boolean fill(int[] res, boolean[] used, int idx, int n) {
        if (idx == res.length) return true;
        if (res[idx] != 0) return fill(res, used, idx + 1, n);

        for (int i = n; i >= 1; i--) {
            if (used[i]) continue;
            int j = (i == 1) ? idx : idx + i;
            if (j < res.length && res[j] == 0) {
                res[idx] = res[j] = i;
                used[i] = true;
                if (fill(res, used, idx + 1, n)) return true;
                res[idx] = res[j] = 0;
                used[i] = false;
            }
        }
        return false;
    }
}
