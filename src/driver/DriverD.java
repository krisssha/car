package driver;

import transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String name, boolean driversLicense, int experience, String category) {
        super(name, driversLicense, experience, category);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + transport.getBrand());
    }
}
