package animal;

import java.util.Objects;

public abstract class Bird extends Animal {
    String movement;

    public Bird(String name, int age, String environment, String movement) {
        super(name, age, environment);
        this.movement = movement;
    }

    public abstract void hunt();

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        if (StringUtils.isNullOrEmpty(movement)) {
            movement = "default";
        }
        this.movement = movement;
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
        Bird bird = (Bird) o;
        return Objects.equals(movement, bird.movement);
    }

}
