class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                count += productMap.getOrDefault(product, 0);

                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        return count * 8;
    }
}