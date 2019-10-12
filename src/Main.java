import taylorseries.TaylorSeries;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int k = 10;
        double x = 3;
        BigDecimal approx = TaylorSeries.Approximate(new BigDecimal(x), k);
        double calc = TaylorSeries.Calculate(x);
        System.out.println(approx);
        System.out.println(calc);
    }
}
