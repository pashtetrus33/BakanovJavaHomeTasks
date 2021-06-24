public class HomeWorkApp {

    public static void main(String[] args) {
        boolean result = isNumberBetween10And20(-2,22);
        System.out.println("Result is " + result);
        System.out.println();
        isNumberPositiveOrNegative(-6786);
        System.out.println();
        int c = 0;
        System.out.println("Number " + c + " is negative. It is " + isNumberNegative(c));
        System.out.println();
        printMessageXTimes("How are you doing?", 5);
        System.out.println();
        int year = 2096;
        System.out.println(year + " year is leap. It is " + isYearLeap(year));

    }
    public static boolean isNumberBetween10And20(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;

    }

    public static void isNumberPositiveOrNegative(int a) {
        if(a >= 0) {
            System.out.println("Число " + a + " положительное!");
        } else {
            System.out.println("Число " + a + " отрицательное!");
        }

    }

    public static boolean isNumberNegative(int a) {
        return a < 0;
    }

    public static void printMessageXTimes (String message, int a) {
        for (int i = 0; i < a; i ++) {
            System.out.println(message);
        }

    }

    public static boolean isYearLeap (int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
}

