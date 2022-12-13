package animal;

public class NonFlyingBird extends Bird {


    public NonFlyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица ест насекомых,зерно или рыбу.");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица спит ночью.");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая перемещается по ." + getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица охотится на земле.");
    }
}
