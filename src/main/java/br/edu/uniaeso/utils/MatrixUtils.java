package br.edu.uniaeso.utils;

import java.awt.Color;

public class MatrixUtils {

    private MatrixUtils() {
    }

    /**
     * Source for discussion:
     * https://www.geeksforgeeks.org/rotate-a-matrix-by-90-degree-in-clockwise-direction-without-using-any-extra-space/
     * 
     * @param colorMatrix
     * @return
     */
    public static Color[][] rotateMatrixClockwise(Color[][] colorMatrix) {
        Color[][] matrix = colorMatrix;
        int N = matrix.length;
        for (int j = 0; j < N; j++) {
            for (int i = N - 1; i >= 0; i--) {
                matrix[i][j] = colorMatrix[i][j];
            }
        }
        return matrix;
    }

    /**
     * Source for discussion:
     * https://www.enjoyalgorithms.com/blog/rotate-a-matrix-by-90-degrees-in-an-anticlockwise-direction
     * 
     * @param colorMatrix
     * @return
     */
    public static Color[][] rotateMatrixCounterClockwise(Color[][] colorMatrix) {
        Color[][] matrix = colorMatrix;
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j++) {
                matrix[N - j - 1][i] = colorMatrix[i][j];
            }
        }
        return matrix;
    }

}
