class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {        
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);
        int n=mergedArray.length;
        if (n % 2 == 0) {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            return mergedArray[n / 2];
        }
        
    }
}