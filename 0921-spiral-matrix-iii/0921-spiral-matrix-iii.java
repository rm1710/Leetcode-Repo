class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int[][] res = new int[rows * cols][2];
        int count = 0, step = 1, index = 0;

        res[count++] = new int[]{rStart, cStart};

        while (count < rows * cols) {
            for (int times = 0; times < 2; times++) {
                int dr = directions[index][0];
                int dc = directions[index][1];
                for (int i = 0; i < step; i++) {
                    rStart += dr;
                    cStart += dc;
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        res[count++] = new int[]{rStart, cStart};
                    }
                }
                index = (index + 1) % 4;
            }
            step++;
        }
        return res;
    }
}
