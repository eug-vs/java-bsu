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
        String str = "";
        for (double[] row : matrix) {
            for (double item : row) {
                str += Double.toString(item) + " ";
            }
            str += "\n";
        }
        return str;
    }
}
