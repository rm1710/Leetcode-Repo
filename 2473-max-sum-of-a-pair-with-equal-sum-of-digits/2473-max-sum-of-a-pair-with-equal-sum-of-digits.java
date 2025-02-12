import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();  // digit sum → max num
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = getDigitSum(num);

            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);  
                map.put(digitSum, Math.max(map.get(digitSum), num));  
            } else {
                map.put(digitSum, num);
            }
        }

        return maxSum;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
