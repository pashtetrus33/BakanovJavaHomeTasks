public class HomeWorkApp {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 16),
                new Cat("Murzik", 5),
                new Cat("Vasya", 20),
                new Cat("Musya", 7),
                new Cat("Leya", 13),

        };
        Plate plate = new Plate(40);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();
        plate.addFood(50);
        plate.info();

    }
}
