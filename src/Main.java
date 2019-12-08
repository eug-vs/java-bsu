import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Main {
    public static void main(String[] args){
        final String input;
        if (args.length == 0) {
            input = "Mon Dec 14 23:45:34 MSK 2017";
            System.out.println("Date argument is not provided, using default: " + input);
        } else {
            input = args[0];
        }

        final String defaultDateFormatString = "EEE MMM d HH:mm:ss zzz yyyy";
        final String dateFormatString = "yyyy MMMM, W 'week in a month,' a, m 'minutes' (z)";
        final String formatString = "%tA, %<tdth day of the month, %<tR %<Tp";

        final SimpleDateFormat dateParser = new SimpleDateFormat(defaultDateFormatString);
        final SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormatString);
        final Calendar calendar = Calendar.getInstance();
        final Formatter formatter = new Formatter();

        try {
            final Date date = dateParser.parse(input);

            calendar.setTime(date);

            System.out.println("Day in year: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Day in month: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day in week: " + calendar.get(Calendar.DAY_OF_WEEK));

            calendar.add(Calendar.DAY_OF_YEAR, 20);
            System.out.println("DateTime in 20 days (Calendar): " + calendar.getTime());

            System.out.println("SimpleDateFormat: " + dateFormatter.format(date));

            System.out.println("Formatter: " + formatter.format(formatString, date));
        } catch (ParseException e) {
            System.out.println("Can not parse using " + defaultDateFormatString);
        }
    }
}
