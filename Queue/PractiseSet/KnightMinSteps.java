package Queue.PractiseSet;
import java.util.*;

public class KnightMinSteps {

    static class Cell {
        int x, y, dist;

        public Cell(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static boolean isInside(int x, int y, int N) {
        return (x >= 1 && x <= N && y >= 1 && y <= N);
    }

    static int minStepToReachTarget(int knightPos[], int targetPos[], int N) {
        // All 8 possible moves of a knight
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        boolean visited[][] = new boolean[N + 1][N + 1];
        Queue<Cell> queue = new LinkedList<>();

        // Starting position
        queue.add(new Cell(knightPos[0], knightPos[1], 0));
        visited[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty()) {
            Cell t = queue.poll();

            // If target reached
            if (t.x == targetPos[0] && t.y == targetPos[1])
                return t.dist;

            // Check all 8 possible moves
            for (int i = 0; i < 8; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];

                if (isInside(x, y, N) && !visited[x][y]) {
                    visited[x][y] = true;
                    queue.add(new Cell(x, y, t.dist + 1));
                }
            }
        }

        // If unreachable
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int N = 30;
        int knightPos[] = {1, 1};
        int targetPos[] = {30, 30};

        System.out.println("Minimum steps = " + minStepToReachTarget(knightPos, targetPos, N));
    }
}
