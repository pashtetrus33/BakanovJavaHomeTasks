public class Dog extends Animal {
    static int count;
    public Dog () {

    }

    public Dog(String name, String color, String type) {
        super(name, color, type);
        super.maxRun =500;
        count++;
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
