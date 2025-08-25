package Matrix;
import java.util.*;
public class SortMatrixWithoutCollections {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 4, 7},
                {1, 3, 8},
                {2, 9, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sortMatrix(matrix);

        System.out.println("\nSorted Matrix:");
        printMatrix(matrix);
    }

    public static void sortMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Convert 2D matrix to 1D array
        int[] temp = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[k++] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(temp));

        // Step 2: Sort the 1D array (using selection sort for example)
        for (int i = 0; i < temp.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[j] < temp[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int t = temp[minIndex];
            temp[minIndex] = temp[i];
            temp[i] = t;
        }

        // Step 3: Put sorted values back into the matrix
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
         matrix[i][j] = temp[k++];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

