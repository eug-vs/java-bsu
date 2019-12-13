package core;

import java.util.ArrayList;
import java.util.Map;

public class DataBase {
    public ArrayList<Student> students;
    public Map<Integer, Teacher> teachers;

    public DataBase() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
       this.students.add(student);
    }

    public void print() {
        if (this.students.size() == 0) {
            System.out.println("Database is empty!");
        } else {
            System.out.println("Database students: ");
            for (Student student : this.students) {
                System.out.println(student);
            }
        }
    }
}
