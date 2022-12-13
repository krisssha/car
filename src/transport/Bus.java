package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }


    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String fuel,
               double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuel, fuelPercentage);
    }
    public void refill() {
        System.out.println("автобус заправлен топливом : " + getFuel());
        setFuelPercentage(100);
    }
    public String toString () {
        return "Автобус " + getBrand() + " "+ getModel()+ " " + getYear() + " года выпуска из " + getCountry()+
                " , " + getColor() + " цвета, с максимальной скоростью - " + getMaxSpeed() + " км/ч"+ "; вид топлива: "
                + getFuel() + " на " + getFuelPercentage() + " %";
    }
}
