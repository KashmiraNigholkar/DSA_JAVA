package Backtracking.PractiseJava;

public class IsSafe {
    static int N = 8;

    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveKT() {
        int sol[][] = new int[N][N];

        // Initialize the solution matrix
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;

        // Possible knight moves
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        // Starting position
        sol[0][0] = 0;

        // Start recursion
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist.");
            return false;
        } else {
            printSolution(sol);
        }

        return true;
    }

    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        int k, next_x, next_y;

        if (movei == N * N) {
            return true;
        }

        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
                    return true;
                } else {
                    // Backtracking
                    sol[next_x][next_y] = -1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        solveKT();
    }
}
