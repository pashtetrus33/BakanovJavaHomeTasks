public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = -7;
        int b = -4;
        int sum = a + b;
        if((sum) >= 0) {
            System.out.println("Сумма положительная и равна: " + sum);
        } else {
            System.out.println("Сумма отрицательная и равна: " + sum);
        }
    }

    public static void printColor() {
        int value = -10;
        if(value <= 0) {
            System.out.println("Красный");
            } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
            } else{
            System.out.println("Зеленый");
            }
    }

    public static void compareNumbers() {
        int a = 40;
        int b = 40;

        if(a >= b) {
            System.out.println("a >= b");
        } else{
            System.out.println("a < b");
        }
    }
}
