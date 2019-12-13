import core.DataBase;
import core.Student;
import core.Teacher;

import java.util.Date;


public class Main {
    public static void main(String[] args){
        final Student testStudent = new Student(
                114565,
                "Sokolov",
                new Date(),
                9.5,
                new int[] {1, 2, 3}
        );
        final Teacher testTeacher = new Teacher(
                "Zenko",
                1
        );

        final DataBase dataBase = new DataBase();
        dataBase.print();
        dataBase.addStudent(testStudent);
        dataBase.print();
    }
}
