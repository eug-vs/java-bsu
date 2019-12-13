package core;

import java.io.BufferedReader;
import java.io.FileReader;
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

    private interface EntityProcessor {
        void addEntityFromLine(String line);
    }

    private void readEntitiesFromFile(String filePath, EntityProcessor entityProcessor) {
        try (
            final BufferedReader reader = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                entityProcessor.addEntityFromLine(line);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }

    public void readStudentsFromFile(String filePath) {
        this.readEntitiesFromFile(filePath, (line -> {
            this.addStudent(new Student(line));
        }));
    }

    public void readTeachersFromFile(String filePath) {
        this.readEntitiesFromFile(filePath, (line -> {
            this.addTeacher(new Teacher(line));
        }));
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
