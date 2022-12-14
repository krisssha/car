package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " "+ getModel()+ " начал движение.");

    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " "+ getModel()+ " окончил движение.");
    }

    @Override
    public void pitstop() {
        System.out.println("Автобус прошел питстоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*100);
    }


  /*  public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
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
    }*/
}
