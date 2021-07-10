public class Cat {
    private String name;
    private int appetite;
    private boolean isFed;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        isFed =p.decreaseFood(appetite);
        if (isFed) {
            System.out.println("Кот " + name + " поел.");
        }
    }
    public boolean isFed () {
        if (isFed) {

            return true;
        } else {
            System.out.println("Кот " + name + " голодный.");
            return false;
        }
    }
}
