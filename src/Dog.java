public class Dog extends Animal {
    static int count;

    public Dog () {

    }

    public Dog(String name, String color, String type) {
        super(name, color, type);
        count++;
    }
    @Override
    public void run(int length) {
        if (length <= 500) {
            super.run(length);
        }
        else {
            System.out.println("Собака " + name + " не побежал(а). Ограничение на забег для собак: " + length + " > 500 м. ");
        }
    }
    @Override
    public  void swum(int length) {
        if (length <= 10) {
            super.swum(length);
        }
        else {
            System.out.println("Собака " + name + " не проплыл(а). Ограничение на заплыв для собак: " + length + " > 10 м. ");
        }
    }
}
