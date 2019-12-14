package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Entity {
    public String id;

    protected final static String DELIMITERS = "-|, ";

    private final static String DATE_FORMAT = "dd.MM.yyyy";
    private final static SimpleDateFormat DATE_PROCESSOR = new SimpleDateFormat(DATE_FORMAT);

    protected static Date parseDate(String dateString) {
        try {
            return DATE_PROCESSOR.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Exception occurred! Unable to parse date according to format " + DATE_FORMAT);
            return new Date();
        }
    }

    protected static String formatDate(Date date) {
       return DATE_PROCESSOR.format(date);
    }

    public abstract String toString();
}
