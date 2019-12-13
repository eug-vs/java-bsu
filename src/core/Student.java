package core;

import java.util.Date;


public class Student {
    private int id;
    private String surname;
    private Date birthDate;
    private double performance;
    private int[] finishedClasses;

    public Student(int id, String surname, Date birthDate, double performance, int[] finishedClasses) {
        this.id = id;
        this.surname = surname;
        this.birthDate = birthDate;
        this.performance = performance;
        this.finishedClasses = finishedClasses;
    }

    @Override
    public String toString() {
        return this.surname + " (Student " + this.id + ")";
    }
}
