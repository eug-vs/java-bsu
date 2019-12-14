package core;

import java.util.Date;


public class MotorShip {
    public String name;
    public String id;
    public Date releaseDate;
    public Date expirationDate;

    public MotorShip(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return this.name + " (MotorShip #" + this.id + ")";
    }
}
