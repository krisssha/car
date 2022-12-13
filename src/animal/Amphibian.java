package animal;

public class Amphibian extends Animal {
    public Amphibian(String name, int age, String environment) {
        super(name, age, environment);
    }

    public void hunt() {
        System.out.println("Земноводное охотится возле водоемов.");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное питается насекомыми.");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит ночью.");
    }

    @Override
    public void go() {
        System.out.println("Земноводное обитает возле водоемов.");
    }
}
