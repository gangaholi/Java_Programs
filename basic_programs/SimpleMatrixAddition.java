/* 1a.  Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from command line arguments). */
public class SimpleMatrixAddition {
    public static void main(String[] args) {
        // Check if the number of command line arguments is correct
        if (args.length != 1) {
            System.out.println("Usage: java MatrixAddition <order N>");
            return;
        }

        // Parse the order N from command line arguments
        int N = Integer.parseInt(args[0]);

        // Check if N is a positive integer
        if (N <= 0) {
            System.out.println("Please enter a positive integer for the order N.");
            return;
        }

        // Create two matrices of order N
        int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] matrixB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Print the matrices
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        // Add the matrices
        int[][] resultMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j]; // Random integer between 0 and 9
            }
        }
        // Print the result
        System.out.println("Result Matrix :");
        printMatrix(resultMatrix);
    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
