package Backtracking;

public class NQueen {
    static int count = 0;

    public static void NQueens(char board[][], int row) {
        if (row == board.length) {
            count++;
            printBoard(board); // Print one valid solution
            System.out.println(); // Add a blank line between solutions
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';          // Place queen
                NQueens(board, row + 1);      // Recurse
                board[row][j] = 'x';          // Backtrack
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4; // Change n to solve for other board sizes
        char[][] board = new char[n][n];

        // Initialize board with 'x' (empty)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        NQueens(board, 0);
        System.out.println("Total ways to solve " + n + "-Queens = " + count);
    }
}
