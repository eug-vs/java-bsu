package algebra;


public class Matrix {
    private double[][] matrix;

    public Matrix(int m, int n) {
        matrix = new double[m][n];
        for (double[] row : matrix) {
            for (double item : row) {
                item = 0;
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
