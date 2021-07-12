public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
       food -= n;
        System.out.println("Из миски съели " + n + " , стало: " + food);

    }
    public void addFood(int n) {
        food +=n;
        System.out.println("В миску добавили " + n + " , стало: " + food);
    }
    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("Еды в миске: " + food);
    }

}
