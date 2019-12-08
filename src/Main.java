import taylorseries.SinXOverX;
import java.math.BigDecimal;
import java.util.Formatter;


public class Main {
    public static void main(String[] args) {
        double x = 3;
        int k = 20;

        if (args.length >= 1) {
            x = Double.parseDouble(args[0]);
        }
        if (args.length == 2) {
            k = Integer.parseInt(args[1]);
        }

        BigDecimal computed = SinXOverX.compute(new BigDecimal(x), k);
        double approximated = SinXOverX.approximate(x);

        final Formatter outputFormatter = new Formatter();
        final String formatString = "Approximated value:%n%1$c%2$.30f%nComputed value:%n%1$c%3$.30f";
        outputFormatter.format(formatString, '\t', approximated, computed);
        System.out.println(outputFormatter);
    }
}
