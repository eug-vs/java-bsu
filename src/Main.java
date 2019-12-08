import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        final String input;
        if (args.length == 0) {
            input = "Mon Dec 14 23:45:34 MSK 2017";
            System.out.println("Date argument is not provided, using default: " + input);
        } else {
            input = args[0];
        }

        final String defaultFormatString = "EEE MMM d HH:mm:ss zzz yyyy";
        final String formatString = "yyyy MMMM, W 'week in a month,' a, m 'minutes' (z)";

        final SimpleDateFormat parser = new SimpleDateFormat(defaultFormatString);
        final SimpleDateFormat formatter = new SimpleDateFormat(formatString);

        try {
            final Date date = parser.parse(input);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            System.out.println("Day in year: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Day in month: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day in week: " + calendar.get(Calendar.DAY_OF_WEEK));
            System.out.println(formatter.format(date));
        } catch (ParseException e) {
            System.out.println("Can not parse using " + defaultFormatString);
        }
    }
}
