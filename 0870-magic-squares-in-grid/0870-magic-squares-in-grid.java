class Solution {
    public boolean isMagicSquare(int[][] grid, int r, int c) {
        // Check if the 3x3 grid contains all numbers from 1 to 9 exactly once
        int[] count = new int[10];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = grid[r + i][c + j];
                if (val < 1 || val > 9 || count[val] > 0) return false;
                count[val]++;
                sum += val;
            }
        }

        // Check if all rows, columns, and diagonals sum to 15 (since 15 is the magic sum for 3x3 grid)
        return sum == 45 &&  // Sum of all numbers in the 3x3 grid should be 45 (1+2+...+9)
            (grid[r][c] + grid[r][c+1] + grid[r][c+2] == 15) &&  // Row 1
            (grid[r+1][c] + grid[r+1][c+1] + grid[r+1][c+2] == 15) &&  // Row 2
            (grid[r+2][c] + grid[r+2][c+1] + grid[r+2][c+2] == 15) &&  // Row 3
            (grid[r][c] + grid[r+1][c] + grid[r+2][c] == 15) &&  // Column 1
            (grid[r][c+1] + grid[r+1][c+1] + grid[r+2][c+1] == 15) &&  // Column 2
            (grid[r][c+2] + grid[r+1][c+2] + grid[r+2][c+2] == 15) &&  // Column 3
            (grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2] == 15) &&  // Diagonal 1
            (grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c] == 15);  // Diagonal 2
    }

    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
