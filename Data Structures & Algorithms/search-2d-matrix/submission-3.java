class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lx = 0;
        int rx = matrix.length - 1;
        while (lx <= rx) {
            int ly = 0;
            int ry = matrix[rx].length - 1;
            int mx = (lx + rx) / 2;
            while (ly <= ry) {
                int my = (ly + ry) / 2;
                if (matrix[mx][my] == target) return true;
                if (matrix[mx][my] < target) {
                    lx = mx + 1;
                    ly = my + 1;
                } else {
                    rx = mx - 1;
                    ry = my - 1;
                }
            }
        }        


        return false;
    }
}
