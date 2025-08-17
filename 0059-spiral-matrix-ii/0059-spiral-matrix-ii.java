class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int row = 0, col = 0;
        int rowl = n - 1, coll = n - 1;
        int count = 1;

        while (row <= rowl && col <= coll) {
            // top
            for (int i = col; i <= coll; i++) {
                ans[row][i] = count++;
            }
            // right
            for (int i = row + 1; i <= rowl; i++) {
                ans[i][coll] = count++;
            }

            // bottom (only if there is more than one row remaining)
            if (row < rowl) {
                for (int i = coll - 1; i >= col; i--) {
                    ans[rowl][i] = count++;
                }
            }

            // left (only if there is more than one column remaining)
            if (col < coll) {
                for (int i = rowl - 1; i > row; i--) {
                    ans[i][col] = count++;
                }
            }

            row++;
            col++;
            rowl--;
            coll--;
        }
        return ans;
    }
}
