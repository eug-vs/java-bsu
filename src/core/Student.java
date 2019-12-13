package core;

import java.util.Date;


public class Student {
    private String id;
    private String surname;
    private Date birthDate;
    private double performance;
    private int[] finishedSubjectsId;

    public Student(String id, String surname, Date birthDate, double performance, int[] finishedSubjectsId) {
        this.id = id;
        this.surname = surname;
        this.birthDate = birthDate;
        this.performance = performance;
        this.finishedSubjectsId = finishedSubjectsId;
    }

    @Override
    public String toString() {
        return this.surname + " (Student " + this.id + ")";
    }
}
