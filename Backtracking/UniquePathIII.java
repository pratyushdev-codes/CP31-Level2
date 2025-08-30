class UniquePathIII {
    int emptyCells = 0;  // total non-obstacle cells
    int paths = 0;       // number of valid paths

    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int st_row = 0, st_col = 0;

        // Count empty cells and find start position
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != -1) {
                    emptyCells++;
                }
                if (grid[i][j] == 1) {
                    st_row = i;
                    st_col = j;
                }
            }
        }

        boolean[][] vis = new boolean[m][n];
        helper(grid, st_row, st_col, m, n, vis, 1);

        return paths;
    }

    public void helper(int[][] grid, int i, int j, int m, int n, boolean[][] vis, int count) {
        // Base case: out of bounds or obstacle or already visited
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == -1 || vis[i][j]) {
            return;
        }

        // If we reach the destination (grid[i][j] == 2)
        if (grid[i][j] == 2) {
            if (count == emptyCells) {
                paths++;
            }
            return;
        }

        // Mark as visited
        vis[i][j] = true;

        // Explore in all 4 directions
        helper(grid, i - 1, j, m, n, vis, count + 1); // up
        helper(grid, i + 1, j, m, n, vis, count + 1); // down
        helper(grid, i, j - 1, m, n, vis, count + 1); // left
        helper(grid, i, j + 1, m, n, vis, count + 1); // right

        // Backtrack (unmark visited)
        vis[i][j] = false;
    }
}
