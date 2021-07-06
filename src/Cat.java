public class Cat extends Animal {
    static int count;
    public Cat() {

    }
    public Cat(String name, String color, String type) {
        super(name, color, type);
        count++;
    }
    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        }
        else {
            System.out.println("Кот " + name + " не побежал(а). Ограничение на забег для котов: " + length + " > 200 м. ");
        }

    }
    @Override
    public  void swum(int length) {
            System.out.println("Кот " + name + " не проплыл(а). Коты не умеют плавать!");
    }
}
