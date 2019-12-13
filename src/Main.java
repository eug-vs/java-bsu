import core.DataBase;
import core.Student;
import core.Teacher;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final String studentsPath = "Student1.txt";
        final String teachersPath = "Teacher.txt";

        final Teacher testTeacher = new Teacher(
                "Zenko",
                1
        );


        final DataBase dataBase = new DataBase();
        dataBase.readStudentsFromFile(studentsPath);
        dataBase.addTeacher(testTeacher);
        System.out.println(dataBase);
    }
}
