package core;

import java.util.Date;


public class MotorShip extends Entity {
    public String name;
    public Date releaseDate;
    public Date expirationDate;

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

    public String getReleaseDate() {
        return formatDate(this.releaseDate);
    }

    public String getExpirationDate() {
        return formatDate(this.expirationDate);
    }
}
