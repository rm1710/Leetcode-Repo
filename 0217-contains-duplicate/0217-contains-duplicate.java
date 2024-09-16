class Solution {
  public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums); // Sort the array
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) // Check for consecutive duplicates
        return true;
    }
    return false;
  }
}