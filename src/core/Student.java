package core;

import java.util.Date;
import java.util.StringTokenizer;


public class Student extends Entity {
    private String id;
    private String surname;
    private Date birthDate;
    private double performance;
    private int[] finishedSubjectsId;

    public Student(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string, DELIMITERS);
        this.id = tokenizer.nextToken();
        this.surname = tokenizer.nextToken();
    }

    public String toString() {
        return this.surname + " (Student " + this.id + ")";
    }
}
