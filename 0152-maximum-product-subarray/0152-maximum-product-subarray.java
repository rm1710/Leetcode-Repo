class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int a = nums[i];
            if (a < 0) { int t = max; max = min; min = t; }

            max = Math.max(a, max * a);
            min = Math.min(a, min * a);

            ans = Math.max(ans, max);
        }
        return ans;
    }
}
