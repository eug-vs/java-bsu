import java.lang.Math;
import TaylorSeries.TaylorSeries;


public class Main {
    public static void main(String[] args) {
        int k = 10;
        double e = Math.pow(10, -k);
        double x = 10;
        System.out.println("Approximating function sin(x)/x at x=" + x + " with precision " + e);
        double approx = TaylorSeries.Approximate(x, e);
        double calc = TaylorSeries.Calculate(x);
        System.out.println(approx);
        System.out.println(calc);
    }
}
