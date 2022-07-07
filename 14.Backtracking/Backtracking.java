import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static void printPermutation(String str, String perm, int index) {
        // Time Complexity: O(n*n!)

        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm + currentChar, index + 1);
        }
    }

    public static boolean isSafe(int row, int col, char board[][]) {
        // horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left => (row-1, col-1)
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q')
                return false;
        }

        // upper right => (row-1, col+1)
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        // lower left => (row+1, col-1)
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q')
                return false;
        }
        // lower right => (row+1, col+1)
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    public static void helper(char board[][], List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> nQueen(int n) {
        // Time Complexity: O(n^n)
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        // String str = "ABC";
        // printPermutation(str, "", 0);
        System.out.println(nQueen(4));
    }
}
