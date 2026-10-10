public class BusiestBusRow {
    // Returns {zero-based row index, total}; ties keep the smaller index.
    public static int[] busiestRow(int[][] grid) {
        int bestRow = 0, bestTotal = -1;
        for (int r = 0; r < grid.length; r++) {
            int total = 0;
            for (int c = 0; c < grid[r].length; c++) total += grid[r][c];
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = r;
            }
        }
        return new int[]{bestRow, bestTotal};
    }
    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
}