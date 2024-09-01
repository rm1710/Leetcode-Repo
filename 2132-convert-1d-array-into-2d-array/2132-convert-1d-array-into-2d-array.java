class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0]; // Check if reshape is possible
        
        int[][] arr = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            arr[i / n][i % n] = original[i]; // Calculate row and column positions
        }
        
        return arr;
    }
}
