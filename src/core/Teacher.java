package core;

import java.util.StringTokenizer;

public class Teacher extends Entity {
    public String surname;
    public int subjectId;

    public Teacher(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string, DELIMITERS);
        this.surname = tokenizer.nextToken();
        this.subjectId = Integer.parseInt(tokenizer.nextToken());
    }

    public String toString() {
        return this.surname + " (Teacher of subject " + this.subjectId + ")";
    }
}
