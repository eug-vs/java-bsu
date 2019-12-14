package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MotorShip {
    public String name;
    public String id;
    public Date releaseDate;
    public Date expirationDate;

    private final static String DELIMITERS = "-|, ";
    private final static String DATE_FORMAT = "dd.MM.yyyy";
    private final static SimpleDateFormat DATE_PARSER = new SimpleDateFormat(DATE_FORMAT);

    private static Date parseDate(String dateString) {
        try {
            return DATE_PARSER.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Exception occurred! Unable to parse date according to format " + DATE_FORMAT);
            return new Date();
        }
    }

    public MotorShip(String recordString) {
        final String[] tokens = recordString.split(DELIMITERS);
        try {
            this.name = tokens[0];
            this.id = tokens[1];
            this.releaseDate = parseDate(tokens[2]);
            this.expirationDate = parseDate(tokens[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception occurred! Record string doesn't provide enough information!");
        }
    }

    public String toString() {
        return this.name + " (MotorShip #" + this.id + ")";
    }
}
