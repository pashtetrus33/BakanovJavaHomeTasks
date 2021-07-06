public class Animal {
    String name;
    String color;
    String type;
    static int count;

    public Animal () {
        count++;

    }

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
        count++;

    }
    public void swum( int length) {
        System.out.println(type +" " + name + " проплыл(а) " + length + " м.");

    }

    public void run(int length) {
        System.out.println(type +" " + name + " пробежал(а) " + length + " м.");

    }


}
