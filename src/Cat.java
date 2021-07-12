public class Cat {
    private String name;
    private int appetite;
    private boolean isFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.isEnoughFood(appetite)) {
            p.decreaseFood(appetite);
            isFed = true;
            System.out.println("Кот " + name + " поел. Cъел " + appetite + ". В миске осталось " + p.getFood());
        } else {
            System.out.println("Кот " + name + " не поел, он голодный. Хотел съесть " + appetite + ". А в миске лишь " + p.getFood());
        }

    }
}
