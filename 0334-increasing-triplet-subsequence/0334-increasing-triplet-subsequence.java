class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean t = false;
        int s = nums.length;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < s; i++) {
            if (nums[i] <= first) {
                first = nums[i]; 
            } else if (nums[i] <= second) {
                second = nums[i]; 
            } else {
                t = true; 
                break;
            }
        }

        return t;
    }
}
