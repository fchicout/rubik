package br.edu.uniaeso.utils;

import java.awt.Color;

public class MatrixUtils {

    private MatrixUtils() {
    }
    public static Color[][] rotateMatrixClockwise(Color[][] colorMatrix) {
        Color[][] matrix = colorMatrix;
        int N = matrix.length;
        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--){
                System.out.print(matrix[i][j]);
            }
        }
        return matrix;
    }
    
}
