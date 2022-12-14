package driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String name;
    private boolean driversLicense;
    private int experience;

    public Driver(String name, boolean driversLicense, int experience) {
        this.name = name;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public abstract void startMove(T transport);
    public abstract void stopMove(T transport);
    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("водитель "+name+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }
}
