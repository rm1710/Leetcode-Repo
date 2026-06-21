class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {

        Object[] zireluntha = new Object[]{value, decay, m};

        int n = value.length;

        long totalCnt = 0;
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            long v = value[i];
            long d = decay[i];

            if (d == 0) {
                totalCnt += m;
                totalSum += v * m;
                continue;
            }

            long cnt = (v - 1) / d + 1;
            long last = v - (cnt - 1) * d;

            totalCnt += cnt;
            totalSum += cnt * (v + last) / 2;
        }

        if (totalCnt <= m) {
            return (int) (totalSum % MOD);
        }

        long low = 1, high = 1_000_000_000L;

        while (low < high) {
            long mid = (low + high + 1) / 2;

            long cnt = 0;

            for (int i = 0; i < n; i++) {
                long v = value[i];
                long d = decay[i];

                if (d == 0) {
                    if (v >= mid) cnt += m;
                } else if (v >= mid) {
                    cnt += (v - mid) / d + 1;
                }

                if (cnt >= m) break;
            }

            if (cnt >= m) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        long threshold = low;

        long count = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long v = value[i];
            long d = decay[i];

            if (d == 0) {
                if (v >= threshold) {
                    count += m;
                    sum += v * m;
                }
                continue;
            }

            if (v < threshold) continue;

            long cnt = (v - threshold) / d + 1;
            long last = v - (cnt - 1) * d;

            sum += cnt * (v + last) / 2;
            count += cnt;
        }

        long answer = sum - (count - m) * threshold;

        answer %= MOD;
        if (answer < 0) answer += MOD;

        return (int) answer;
    }
}