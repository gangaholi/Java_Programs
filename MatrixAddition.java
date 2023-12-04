/* 1.  Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from command line arguments). */
public class MatrixAddition {
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
        int[][] matrixA = generateRandomMatrix(N);
        int[][] matrixB = generateRandomMatrix(N);

        // Print the matrices
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        // Add the matrices
        int[][] resultMatrix = addMatrices(matrixA, matrixB);

        // Print the result
        System.out.println("Sum of Matrix A and Matrix B:");
        printMatrix(resultMatrix);
    }

    // Function to generate a random matrix of order N
    private static int[][] generateRandomMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random integer between 0 and 9
            }
        }
        return matrix;
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int N = matrixA.length;
        int[][] resultMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
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