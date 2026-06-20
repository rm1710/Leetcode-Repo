class Solution {
    public int specialTriplets(int[] nums) {
        long MOD = 1_000_000_007L;
        long ans = 0;

        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0) + 1);
        }

        for (int j = 0; j < nums.length; j++) {
            right.put(nums[j], right.get(nums[j]) - 1);

            int target = nums[j] * 2;

            long leftCount = left.getOrDefault(target, 0);
            long rightCount = right.getOrDefault(target, 0);

            ans = (ans + leftCount * rightCount) % MOD;

            left.put(nums[j], left.getOrDefault(nums[j], 0) + 1);
        }

        return (int) ans;
    }
}