class Solution {
    public boolean isValidSudoku(char[][] board) {
        // create a HashSet for each check
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                int bIndex = (r / 3) * 3 + (c / 3);
                if (val == '.') continue;
                if (!rows[r].add(val) ||
                !cols[c].add(val) ||
                !box[bIndex].add(val)) {
                    return false;
                }
            }
        }
        return true;
    }
}
