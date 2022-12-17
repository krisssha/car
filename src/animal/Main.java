package animal;

public class Main {
    public static void main(String[] args) {
        Animal horse = new Herbivores("Лошадь", 3, "земля", 30, "сено");
        Animal gazelle = new Herbivores("Газель", 5, "земля", 40, "трава");
        Animal giraffe = new Herbivores("Жираф", 10, "земля", 20, "фрукты и листья");
        Animal hyena = new Predator("Гиена", 15, "земля", 30, "мясо");
        Animal tiger = new Predator("Тигр", 5, "земля", 60, "мясо");
        Animal bear = new Predator("Медведь", 9, "земля", 40, "мясо");
        Animal frog = new Amphibian("Лягушка", 1, "водоем");
        Animal freshwaterSnake = new Amphibian("Уж пресноводный", 7, "водоем");
        Animal peacock = new NonFlyingBird("Павлин", 3, "земля", "пешком");
        Animal penguin = new NonFlyingBird("Пингвин", 2, "лед", "пешком");
        Animal dodoBird = new NonFlyingBird("Птица додо", 7, "земля", "пешком");
        Animal gull = new FlyingBird("Чайка", 4, "воздух", "летает");
        Animal albatross = new FlyingBird("Альбатрос", 5, "воздух", "летает");
        Animal falcon = new FlyingBird("Сокол", 2, "воздух", "летает");

        System.out.println(horse.toString());
        System.out.println(hyena.toString());
        System.out.println(frog.toString());
        System.out.println(dodoBird.toString());
        System.out.println(albatross.toString());
    }
}
