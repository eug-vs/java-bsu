package algebra;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

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

    public Matrix transposeMajor() {
        Matrix transposed = new Matrix(this.m, this.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < n; j++) {
                transposed.matrix[j][i] = this.matrix[i][j];
            }
        }
        return transposed;
    }

    public Matrix transposeMinor() {
        Matrix transposed = new Matrix(this.m, this.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < n; j++) {
                transposed.matrix[this.n - 1 - j][this.n - 1 - i] = this.matrix[i][j];
            }
        }
        return transposed;
    }

    public boolean isEqual(Matrix other){
        if (this.m != other.m || this.n != other.n) {
            return false;
		}
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matrix[i][j] != other.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void task(){
        double[] lastRow = this.matrix[this.m - 1];
        class Cmp implements Comparator<Double> {
            @Override
            public int compare (Double a, Double b) {
                return (int)(b - a);
            }
        }
        Cmp cmp = new Cmp();
        Collections.sort(lastRow, cmp);
    }
}

