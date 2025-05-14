package TwoDArrays;

public class DiagonalSum {
    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal (avoid double counting the center element)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 114, 15, 16}
        };

        int result = DiagonalSum(matrix);
        System.out.println("Diagonal sum is: " + result);
    }
}
