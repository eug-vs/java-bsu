package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
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

    public void readStudentsFromFile(String filePath) {
        try (
            final BufferedReader reader = new BufferedReader(new FileReader(filePath));
        ) {
            String buffer;
            final String DELIMETERS = "[ _;!?]+";
            while ((buffer = reader.readLine()) != null) {
                final String[] tokens = buffer.split(DELIMETERS);
                final String id = tokens[0];
                final String surname = tokens[1];
                final Student student = new Student(
                        id,
                        surname,
                        new Date(),
                        9.5,
                        new int[] {1, 2, 3}
                );
                this.addStudent(student);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred during reading from file!");
            e.printStackTrace();
        }
    }


    public String toString() {
        StringBuilder str = new StringBuilder();
        if (this.students.size() > 0) {
            str.append("Database students:\n");
            for (Student student : this.students) {
                str.append('\t');
                str.append(student);
                str.append('\n');
            }
        } else {
            str.append("Database student list is empty!\n");
        }

        if (this.teachers.size() > 0) {
            str.append("Database teachers:\n");
            for (Teacher teacher : this.teachers.values()) {
                str.append('\t');
                str.append(teacher);
                str.append('\n');
            }
        } else {
            str.append("Database teacher list is empty!\n");
        }
        return str.toString();
    }
}
