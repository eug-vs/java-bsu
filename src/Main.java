import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        final String input = "Mon Dec 14 23:45:34 MSK 2017";

        final String defaultFormatString = "EEE MMM d HH:mm:ss zzz yyyy";
        final String formatString = "yyyy MMMM, W 'week in a month,' a, m 'minutes' (z)";

        final SimpleDateFormat parser = new SimpleDateFormat(defaultFormatString);
        final SimpleDateFormat formatter = new SimpleDateFormat(formatString);
        try {
            final Date date = parser.parse(input);
            System.out.println("Formatted date using SimpleDateFormat: ");
            System.out.println(formatter.format(date));
        } catch (ParseException e) {
            System.out.println("Can not parse using " + defaultFormatString);
        }
    }
}
