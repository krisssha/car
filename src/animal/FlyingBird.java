package animal;

public class FlyingBird extends Bird {

    public FlyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица ест насекомых,зерно или рыбу.");
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица спит ночью.");
    }

    @Override
    public void go() {
        System.out.println("Летающая перемещается по ." + getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотится в воздухе.");
    }
}

