package algebra;

import java.util.Random;


public class Matrix {
    private double[][] matrix;
    private int m;
    private int n;

    public Matrix(int m, int n) throws ArrayIndexOutOfBoundsException {
        this.matrix = new double[m][n];
        if (m <= 0 || n <= 0) {
            throw new ArrayIndexOutOfBoundsException("Matrix size <= 0");
        }
        this.m = m;
        this.n = n;
        this.fill();
    }

    private void fill() {
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.matrix[i][j] = rand.nextDouble();
            }
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (double[] row : matrix) {
            for (double item : row) {
                str.append(item);
                str.append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
