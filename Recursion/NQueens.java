import java.util.*;

public class NQueens {

    public static void solve(int col, char[][] board, List<List<String>> ans) {

        int n = board.length;

        // ✅ base case: all queens placed
        if (col == n) {
            ans.add(construct(board));
            return;
        }

        // try placing queen in every row of current column
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';

                solve(col + 1, board, ans);

                // backtrack
                board[row][col] = '.';
            }
        }
    }

    // ✅ check if safe to place queen
    public static boolean isSafe(int row, int col, char[][] board) {

        int n = board.length;

        // check left side
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // lower diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // convert board to list of strings
    public static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 8;

        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        List<List<String>> ans = new ArrayList<>();

        solve(0, board, ans);

        // print result
        for (List<String> solution : ans) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}