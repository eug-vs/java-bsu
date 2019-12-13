package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Entity {
    public static final String DELIMITERS = " ,;?_";
    public static final String DATE_FORMAT_STRING = "dd.MM.yyyy";

    private static final SimpleDateFormat DATE_PARSER = new SimpleDateFormat(DATE_FORMAT_STRING);

    public static Date parseDate(String str) {
        try {
            return DATE_PARSER.parse(str);
        } catch (ParseException e) {
            System.out.println("Unable to parse data according to format " + DATE_FORMAT_STRING);
            e.printStackTrace();
            return new Date();
        }
    };

    public abstract String toString();
}
