package core;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBase {
    public ArrayList<Student> students;
    public HashMap<Integer, Teacher> teachers;

    public DataBase() {
        this.students = new ArrayList<Student>();
        this.teachers = new HashMap<Integer, Teacher>();
    }

    public void addStudent(Student student) {
       this.students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.put(teacher.subjectId, teacher);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.students.size() > 0) {
            stringBuilder.append("Database students:\n");
            for (Student student : this.students) {
                stringBuilder.append('\t');
                stringBuilder.append(student);
                stringBuilder.append('\n');
            }
        } else {
            stringBuilder.append("Database student list is empty!\n");
        }

        if (this.teachers.size() > 0) {
            stringBuilder.append("Database teachers:\n");
            for (Teacher teacher : this.teachers.values()) {
                stringBuilder.append('\t');
                stringBuilder.append(teacher);
                stringBuilder.append('\n');
            }
        } else {
            stringBuilder.append("Database teacher list is empty!\n");
        }
        return stringBuilder.toString();
    }
}
