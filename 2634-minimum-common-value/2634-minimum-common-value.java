class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
         int i = 0; // nums1's index
int j = 0; // nums2's index

// Corrected while loop condition to check both nums1 and nums2 lengths
while (i < nums1.length && j < nums2.length) {
    if (nums1[i] == nums2[j]) {
        return nums1[i]; // Return the first common element found
    }
    if (nums1[i] < nums2[j]) {
        ++i; // Increment i if nums1[i] is smaller
    } else {
        ++j; // Increment j if nums2[j] is smaller
    }
}

return -1; // Retur
    }
}