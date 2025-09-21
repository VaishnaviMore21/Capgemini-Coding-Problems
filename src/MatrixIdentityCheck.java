
import java.util.*;
public class MatrixIdentityCheck {

    public static boolean areMatricesIdentical(int[][] A, int[][] B) {
        // Check if dimensions are the same
        if (A.length != B.length || A[0].length != B[0].length) {
            return false;
        }

        // Compare each element
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }

        return true; // All elements matched
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 5}
        };

        int[][] B = {
            {1, 2},
            {3, 4}
        };

        if (areMatricesIdentical(A, B)) {
            System.out.println("Matrices are identical.");
        } else {
            System.out.println("Matrices are NOT identical.");
        }
    }
}
