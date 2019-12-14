import core.DataBase;
import core.MotorShip;


public class Main {
    public static void main(String[] args){
        final MotorShip testMotorShip = new MotorShip("Flying Dutchman, 54893214, 17.06.1790-17.06.1850");
        final DataBase dataBase = new DataBase();

        System.out.println(dataBase);
        dataBase.addEntity(testMotorShip);
        System.out.println(dataBase);
    }
}
