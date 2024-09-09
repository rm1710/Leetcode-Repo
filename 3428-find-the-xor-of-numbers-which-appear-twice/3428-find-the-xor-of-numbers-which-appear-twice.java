class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        final int kMax = 50;
        int ans = 0;
        int[] count = new int[kMax + 1];

        for (int num : nums) {
            if (++count[num] == 2) {
                ans ^= num;
            }
        }
        return ans;
    }
}
