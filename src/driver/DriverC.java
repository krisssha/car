package driver;

import transport.Transport;
import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String name, boolean driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand());
    }
}
