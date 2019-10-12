package taylorseries;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class TaylorSeries {

    public static BigDecimal Approximate(BigDecimal x, int k) {
        BigDecimal e = new BigDecimal(Math.pow(10, -k)).setScale(k+1, RoundingMode.FLOOR);
        System.out.println("Approximating function sin(x)/x at x=" + x + " with precision " + e);
        BigDecimal result = new BigDecimal(0);
        BigDecimal term = new BigDecimal(1);
        BigDecimal flipper = new BigDecimal(-1);
        BigDecimal fact_counter = new BigDecimal(2);
        while(term.abs().compareTo(e) > 0) {
            result = result.add(term);
            term = term.multiply(flipper).multiply(x).multiply(x);
            term = term.divide(fact_counter, k+1, RoundingMode.CEILING);
            fact_counter = fact_counter.subtract(flipper); // ++
            term = term.divide(fact_counter, k+1, RoundingMode.CEILING);
            fact_counter = fact_counter.subtract(flipper); // ++
        }
        return result;
    }

    public static double Calculate(double x) {
        return Math.sin(x)/x;
    }

}