package taylorseries;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SinXOverX {

    public static BigDecimal compute(BigDecimal x, int k) {
        final BigDecimal PRECISION = new BigDecimal(Math.pow(10, -k)).setScale(k+1, RoundingMode.FLOOR);
        final BigDecimal MINUS_ONE = new BigDecimal(-1);

        BigDecimal result = new BigDecimal(0);
        BigDecimal term = new BigDecimal(1);
        BigDecimal divisor = new BigDecimal(2);

        System.out.println("Approximating function sin(x)/x at x=" + x + " with precision " + PRECISION + ":");

        while(term.abs().compareTo(PRECISION) > 0) {
            result = result.add(term);
            term = term.multiply(MINUS_ONE).multiply(x).multiply(x);
            term = term.divide(divisor, k+1, RoundingMode.CEILING);
            divisor = divisor.subtract(MINUS_ONE);
            term = term.divide(divisor, k+1, RoundingMode.CEILING);
            divisor = divisor.subtract(MINUS_ONE);
        }
        return result;
    }

    public static double approximate(double x) {
        return Math.sin(x)/x;
    }
}
