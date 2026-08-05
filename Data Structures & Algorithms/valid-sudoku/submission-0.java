class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!rows.add(board[i][j])) return false;
                }
                if (board[j][i] != '.') {
                    if (!cols.add(board[j][i])) return false;
                }
                int rowInd = 3 * (i / 3);
                int colInd = 3 * (i % 3);
                char ch = board[rowInd + j / 3][colInd + j % 3];
                if (ch != '.') {
                    if (!box.add(ch)) return false;
                }
            }
        }
        return true;
    }
}
