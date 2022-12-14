package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel()+ " начал движение.");

    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel()+ " окончил движение.");

    }

    @Override
    public void pitstop() {
        System.out.println("Грузовик прошел питстоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*9);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*160);
    }
}
