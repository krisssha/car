import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, bodyType.SEDAN);
        Car audi = new Car("Audi", "A8", 3.0, bodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, bodyType.SEDAN);
        Car kia = new Car("Kia", "Sportage", 2.4, bodyType.CROSSOVER);
        Bus mercedes = new Bus("Mercedes", "conecto", 6.0, capacityType.AVERAGE);
        Bus mercedes2 = new Bus("Mercedes", "ecirato", 5.0, capacityType.AVERAGE);
        Bus paz = new Bus("ПАЗ", "3205", 4.5, capacityType.BIG);
        Bus baz = new Bus("БАЗ", "2215", 4.5, capacityType.EXTRA_LARG);
        Truck gaz = new Truck("ГАЗ", "7878", 6.2, loadType.N2);
        Truck isuzu = new Truck("ISUZU", "00", 6.2, loadType.N3);
        Truck fuso = new Truck("FUSO", "86", 7.1, loadType.N1);
        Truck kamaz = new Truck("КамАЗ", "0989", 8.2, loadType.N2);

        lada.start();
        gaz.stop();
        isuzu.pitstop();

        DriverB andrey = new DriverB("Andrey", true, 5);
        DriverC mihail = new DriverC("Mihail", true, 23);
        DriverD vasiliy = new DriverD("Vasiliy", true, 10);

        andrey.startMove(lada);
        mihail.stopMove(fuso);
        vasiliy.refill(mercedes2);


    }
}
