import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Truck;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "A8", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage", 2.4);
        Bus mercedes = new Bus("Mercedes", "conecto", 6.0);
        Bus mercedes2 = new Bus("Mercedes", "ecirato", 5.0);
        Bus paz = new Bus("ПАЗ", "3205", 4.5);
        Bus baz = new Bus("БАЗ", "2215", 4.5);
        Truck gaz = new Truck("ГАЗ", "7878", 6.2);
        Truck isuzu = new Truck("ISUZU", "00", 6.2);
        Truck fuso = new Truck("FUSO", "86", 7.1);
        Truck kamaz = new Truck("КамАЗ", "0989", 8.2);

        lada.start();
        gaz.stop();
        isuzu.pitstop();

        DriverB andrey = new DriverB("Andrey", true, 5);
        DriverC mihail = new DriverC("Mihail", true, 23);
        DriverD vasiliy = new DriverD("Vasiliy", true, 10);

        andrey.startMove(lada);
        mihail.stopMove(fuso);
        vasiliy.refill(mercedes2);


      /*  Car Lada = new Car("Lada", "Granta", 2015, "России", "желтый", 1.7,
                "x000xx000", null, "седан", 0, false,
                new Car.Key(true, false), new Car.Insurance(LocalDate.now(), 12000, "x333xx"));

        Car Audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный",
                3.0, "у890то908", "мкпп", "седан", 0,
                false, new Car.Key(true, false), new Car.Insurance(LocalDate.now(), 15000, "p333xx"));

        Car BMW = new Car("BMW", "Z8", 2021, "Германии", "", 3.0,
                "ц456ке456", "автомат", "седан", 6, false,
                new Car.Key(true, false), new Car.Insurance(LocalDate.now(), 25000, "я333xx"));

        Car Kia = new Car("Kia", "Sportage", 2018, "Южной Корее", "красный",
                2.4, "л900ол900", "мкпп", "седан", 5,
                false, new Car.Key(true, false), new Car.Insurance(LocalDate.now(), 15000,
                "з303xx"));

        Car Hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый",
                1.6, "ш890шо890", "автомат", "седан", 5,
                true, new Car.Key(true, false), new Car.Insurance(LocalDate.now(), 15000,
                "л890лол"));

        Lada.tireСhange(12);
        //System.out.println(Lada.isRubberType());

        System.out.println(Lada.toString());
        System.out.println(Audi.toString());
        System.out.println(BMW.toString());
        System.out.println(Kia.toString());
        System.out.println(Hyundai.toString());

        System.out.println();

        Train lastochka = new Train("\"Ласточка\"", "B-901", 2011, "России", 301,
                "Белорусского вокзала" , "Минск-Пассажирский", 3500, 11,
                "дизель", 55);
        System.out.println(lastochka.toString());
         Train leningrad = new Train("\"Ленинград\"", "D-125", 2019, "России", 270,
                 "Ленинградского вокзала", "Ленинград - Пассажарский", 1700, 8, "" +
                 "дизель",34);
        System.out.println(leningrad.toString());
        System.out.println();

        Bus mercedes = new Bus("Mercedes", "conecto", 2020, "Германии", "белого" , 250,
                "дизель", 56);
        System.out.println(mercedes.toString());

        Bus mercedes2 = new Bus("Mercedes", "ecirato", 2021, "Германии", "черного", 350,
                "бензин",100);
        System.out.println(mercedes2.toString());*/
    }

}
