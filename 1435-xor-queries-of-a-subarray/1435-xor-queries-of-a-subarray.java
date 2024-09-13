class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefixXor[] = new int[arr.length], res[] = new int[queries.length];
        prefixXor[0] = arr[0];

        for (int i = 1; i < arr.length; i++) 
            prefixXor[i] = prefixXor[i - 1] ^ arr[i];
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0], R = queries[i][1];
            res[i] = (L == 0) ? prefixXor[R] : prefixXor[R] ^ prefixXor[L - 1];
        }

        return res;
    }
}
