public class Cat extends Animal {
    static int count;
    public Cat() {

    }
    public Cat(String name, String color, String type) {
        super(name, color, type);
        super.maxRun = 200;
        count++;
    }

        @Override
    public  void swum(int length) {
            System.out.println("Кот " + name + " не проплыл(а). Коты не умеют плавать!");

    }
}
