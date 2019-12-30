package TaylorSeries;

public class TaylorSeries {

    public static double Approximate(double x, double precision) {
        double result = 0;
        double term = 1;
        int fact_counter = 2;
        while(Math.abs(term) > precision) {
            result += term;
            term *= -1;
            term *= x*x;
            term /= fact_counter;
            fact_counter++;
            term /= fact_counter;
            fact_counter++;
        }
        return result;
    }

    public static double Calculate(double x) {
        return Math.sin(x)/x;
    }

}