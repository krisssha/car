package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void start();

    public abstract void stop();


}
   /* private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private String fuel;
    private double fuelPercentage;*/
/*


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "цвет указан неверно!";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) {
            maxSpeed = 0;
        }
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, String fuel, double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    public Transport(String brand, String model, int year, String country, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;

    }
    public Transport(String brand, String model, int year, String country, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;

    }
    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed= maxSpeed;

    }
    public Transport(String brand, String model, int year, String country, int maxSpeed, String fuel, double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
this.fuelPercentage = fuelPercentage;
    }
    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, String fuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;

    }
    public Transport(String brand, String model, int year, String country,String color, String fuel, double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.fuel = fuel;
        this.fuelPercentage = fuelPercentage;

    }
    public abstract void refill();

}*/
