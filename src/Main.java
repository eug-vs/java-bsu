import core.Student;

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
        System.out.println(testStudent);
    }
}
