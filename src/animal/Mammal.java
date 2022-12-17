package animal;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private String environem;
    private int speed;
    private String food;

    public Mammal(String name, int age, String environemt, int speed, String food) {
        super(name, age, environemt);
        this.speed = speed;
        this.food = food;
    }

    public abstract void walk();

    public String getEnvironem() {
        return environem;
    }

    public void setEnvironem(String environem) {
        if (StringUtils.isNullOrEmpty(environem)) {
            environem = "default";
        }
        this.environem = environem;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (StringUtils.isNullOrEmpty(food)) {
            food = "default";
        }
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(environem, mammal.environem) && Objects.equals(food, mammal.food);
    }

}
