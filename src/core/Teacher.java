package core;

public class Teacher {
    public String surname;
    public int subjectId;

    public Teacher(String surname, int subjectId) {
        this.surname = surname;
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return this.surname + " (Teacher of subject " + this.subjectId + ")";
    }
}
