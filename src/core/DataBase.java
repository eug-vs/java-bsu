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

    public void print() {
        if (this.students.size() > 0) {
            System.out.println("Database students: ");
            for (Student student : this.students) {
                System.out.print('\t');
                System.out.println(student);
            }
        } else {
            System.out.println("Database student list is empty!");
        }

        if (this.teachers.size() > 0) {
            System.out.println("Database teachers: ");
            for (Teacher teacher : this.teachers.values()) {
                System.out.print('\t');
                System.out.println(teacher);
            }
        } else {
            System.out.println("Database teacher list is empty!");
        }
    }
}
