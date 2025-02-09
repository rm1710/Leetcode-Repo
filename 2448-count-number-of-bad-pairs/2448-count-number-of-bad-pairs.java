class Solution {
    public long countBadPairs(int[] nums) {
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;
            goodPairs += map.getOrDefault(diff, 0); 
            map.put(diff, map.getOrDefault(diff, 0) + 1); 
        }

        return totalPairs - goodPairs;
    }
}