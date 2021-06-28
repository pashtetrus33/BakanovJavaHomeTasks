import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Задание №1");

        int[] arrayTask1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(arrayTask1));
        invertArrayBites(arrayTask1);
        System.out.println(Arrays.toString(arrayTask1));
        System.out.println();

        System.out.println("Задание №2");

        int[] arrayTask2 = new int[100];
        arrayInit(arrayTask2);
        System.out.println(Arrays.toString(arrayTask2));
        System.out.println();

        System.out.println("Задание №3");
        int[] arrayTask3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arrayTask3));
        multipliedByTwoWhichLessThanSix(arrayTask3);
        System.out.println(Arrays.toString(arrayTask3));
        System.out.println();

        System.out.println("Задание №4");
        int[][] arrayTask4 = new int[5][5];
        fillDiagonalElementsByOne(arrayTask4);
        print2DArray(arrayTask4);
        System.out.println();

        System.out.println("Задание №5");
        int arrayTask5Length = 20;
        int arrayTask5Value = 4;
        int[] arrayTask5 = createArray(arrayTask5Length, arrayTask5Value);
        System.out.println(Arrays.toString(arrayTask5));
        System.out.println();

        System.out.println("Задание №6");
        int[] arrayTask6 = { 19, 50, 300, -20, 11, 40, -5, -2, 456, 8, 9, 1 };
        System.out.println("Поиск максимального и минимального элемента массива: " + Arrays.toString(arrayTask6));
        searchMaxElementOfArray(arrayTask6);
        searchMinElementOfArray(arrayTask6);
        System.out.println();

        System.out.println("Задание №7");
        int[] arrayTask7 = { -4, 5, 0, 7, 1, 3, 8, -2 };
        System.out.println(Arrays.toString(arrayTask7));
        System.out.println();
        boolean isBalanced = checkBalance(arrayTask7);
        System.out.println("Значение переменной: " + isBalanced);

        System.out.println();

        System.out.println("Задание №8");
        // положительный shiftNumber сдвигает вправо, отрицательный влево
        int shiftNumber = -3;
        String directionOfShift;
        if (shiftNumber < 0) {
            directionOfShift = "влево";
        } else {
            directionOfShift = "вправо";
        }
        int[] arrayTask8 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Сдвигаем массив на " + Math.abs(shiftNumber) + " элемента(ов) " + directionOfShift);
        System.out.println(Arrays.toString(arrayTask8));
        shiftArrayTask8ToNPositions(arrayTask8, shiftNumber);
        System.out.println(Arrays.toString(arrayTask8));

    }
    //метод для задания 1
    public static void invertArrayBites(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }
    //метод для задания 2
    public static void arrayInit(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1);
        }
    }
    //метод для задания 3
    public static void multipliedByTwoWhichLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *=2;
            }
        }
    }
    //метод для задания 4
    public static void fillDiagonalElementsByOne(int[][] arr) {
        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (i == j) {
                   arr[i][j] = 1;
               } else if ((i +j) == (arr.length -1)) {
                   arr[i][j] = 1;
               }
               else {
                       arr[i][j] = 0;
               }

            }
        }
    }
    //метод для задания 4 (выводит графическое отображение двумерного массива
    public static void print2DArray(int[][] arr) {
          //for (int i = 0; i <= arr[0].length; i ++) {
            //System.out.print(i + " ");
        // }
       // System.out.println();
        for (int i =0; i < arr.length; i++) {
            //System.out.print(i + 1 +" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //метод для задания 5
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    // метод для задания 6
    public static void searchMaxElementOfArray(int[] arr) {
        int max = arr[0];
        for (int i=0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
    }
    //метод для задания 6
    public static void searchMinElementOfArray(int[] arr) {
        int min = arr[0];
        for (int i=0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве = " + min);
    }
    //метод для задания 7
    public static boolean checkBalance(int[] arr) {
        int leftsum = 0;
        int rightsum =0;
        for (int j = 1; j < arr.length; j++) {
            rightsum += arr[j];
        }

        for (int i =0; i < (arr.length -1); i++) {
            leftsum += arr[i];
            System.out.println("Левая сумма = " + leftsum);
            System.out.println("Правая сумма = " + rightsum);
            System.out.println();
            if (leftsum == rightsum) {
                return true;
            }
            rightsum -= arr[i+1];

        }
        return false;
    }
    //метод для задания 8
    public static void shiftArrayTask8ToNPositions(int[] arr, int n) {
        if (n >= 0) {
            for (int j = 0; j < n; j++) {
                int last = arr[arr.length - 1];
                for (int i = (arr.length - 1); i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;
            }

        } else {
            for (int j = 0; j > n; j--) {
                int first = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length -1] = first;
            }
        }
    }
}
