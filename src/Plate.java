public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }
    public void addFood(int n) {
        food +=n;
        System.out.println("Добавили " + n + " в миску, стало: " + food);
    }

    public void info() {
        System.out.println("Еды в миске: " + food);
    }

}
