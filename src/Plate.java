public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean isEnoughFood( int n) {
        return food >= n;
    }
    public void decreaseFood(int n) {
       food -= n;


    }
    public void addFood(int n) {
        food +=n;
        System.out.println("Добавили " + n + " в миску, стало: " + food);
    }
    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("Еды в миске: " + food);
    }

}
