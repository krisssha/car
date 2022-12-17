package animal;

public class Predator extends Mammal{
    public Predator(String name, int age, String environem, int speed, String food) {
        super(name, age, environem, speed, food);
    }
public void hunt(){

}
    @Override
    public void eat() {
        System.out.println("Хищник охотится.");

    }

    @Override
    public void sleep() {
        System.out.println("Хищник спит ночью и днем.");
    }

    @Override
    public void go() {
        System.out.println("Хищник ходит в лесу.");
    }

    @Override
    public void walk() {
        System.out.println("Хищник гуляет.");
    }
}
