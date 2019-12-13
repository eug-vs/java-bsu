import core.DataBase;


public class Main {
    public static void main(String[] args) {
        final String studentsPath = "Student1.txt";
        final String teachersPath = "Teacher.txt";
        final DataBase dataBase = new DataBase();

        dataBase.readStudentsFromFile(studentsPath);
        dataBase.readTeachersFromFile(teachersPath);

        System.out.println(dataBase);
    }
}
