class Solution {
    public int findRowSum(int[][] grid, int r, int c) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                int val = grid[r + i][c + j];
                if (val < 1 || val > 9) return -1;  // Values must be between 1 and 9
                rowSum += val;
            }
            if (i == 0) {
                sum = rowSum;
            } else {
                if (sum != rowSum) {
                    return -1;
                }
            }
        }
        return sum;
    }

    public int findColSum(int[][] grid, int r, int c) {
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                int val = grid[r + i][c + j];
                colSum += val;
            }
            if (j == 0) {
                sum = colSum;
            } else {
                if (sum != colSum) {
                    return -1;
                }
            }
        }
        return sum;
    }

    public int diagonalSum(int[][] grid, int r, int c) {
        int sum1 = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2];
        int sum2 = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c];
        if (sum1 == sum2) {
            return sum1;
        }
        return -1;
    }

    public boolean isMagicSquare(int[][] grid, int r, int c) {
        boolean[] visited = new boolean[10];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[r + i][c + j];
                if (val < 1 || val > 9 || visited[val]) {
                    return false;  // Values must be distinct and between 1 and 9
                }
                visited[val] = true;
            }
        }

        int rowSum = findRowSum(grid, r, c);
        if (rowSum == -1) return false;

        int colSum = findColSum(grid, r, c);
        if (colSum == -1) return false;

        int diagonalSum = diagonalSum(grid, r, c);
        if (diagonalSum == -1) return false;

        return rowSum == colSum && rowSum == diagonalSum;
    }

    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
