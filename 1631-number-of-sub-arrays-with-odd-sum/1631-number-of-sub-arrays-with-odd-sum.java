class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int oddCount = 0, evenCount = 1;
        int sum = 0, result = 0;
        
        for (int num : arr) {
            sum += num; 
            if (sum % 2 == 0) { 
                result = (result + oddCount) % mod;
                evenCount++; 
            } else {
                result = (result + evenCount) % mod;                                            
                oddCount++; 
            }
        }
        return result;
    }
}