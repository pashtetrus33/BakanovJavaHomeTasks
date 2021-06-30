import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static int SIZE;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_Y = 'Y';
    public static final char DOT_Z = 'Z';
    public static char turn_NOW;
    public static int dotsNumber;
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int countX  = 0;
    public static int countO  = 0;
    public static int countY  = 0;
    public static int countZ  = 0;
    public static int free    = 0;
    // Для решения некоторых затыков гуглил, но свой мозг также включал :)
    public static void main(String[] args) {
        do {
            System.out.print("Введите размер игрового поля (целое число больше нуля): ");
            SIZE = getNumber();
        } while (SIZE <= 0);

        do {
            System.out.print("Введите количество фишек от 2 до 4: ");
            dotsNumber = getNumber();
        }while (dotsNumber <2 || dotsNumber >4);

        initMap();
        printMap();
        label:
        while (true)
        {
            //Очередь игрока с X-ми
            turn_NOW = DOT_X;
            humanTurn(turn_NOW);
            printMap();
            if (checkWin(turn_NOW)) {
                System.out.println("Победил человек c X");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            //Очередь компьютера
            turn_NOW = DOT_O;
            int n =0;

            while (n < dotsNumber-1) {
                aiTurn(turn_NOW);
                printMap();
                if (checkWin(turn_NOW)) {
                    System.out.println("Победил Искуственный интелект c " + turn_NOW);
                    break label;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break label;
                }
                n++;
                if (n == 1) {
                    turn_NOW = DOT_Y;
                } else if (n ==2) {
                    turn_NOW = DOT_Z;
                }

            }
        }

        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        int i =0;
        // Проверка выигрыша по строкам
        while (i < SIZE) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != symb) {
                    break;
                } else {
                    if (j == SIZE -1) {
                        return true;
                    }
                }
            }
            i++;
        }
        i =0;

        // Проверка выигрыша по столбцам
        while (i < SIZE) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] != symb) {
                    break;
                } else {
                    if (j == SIZE -1) {
                        return true;
                    }
                }
            }
            i++;
        }
        // Проверка выигрыша по диагонали
        for (int j = 0; j < SIZE; j++) {
            if (map[j][j] != symb) {
                break;
            } else {
                if (j == SIZE -1) {
                    return true;
                }
            }
        }

        // Проверка выигрыша по другой диагонали
        for (int j = 0; j < SIZE; j++) {
            if (map[j][SIZE - 1 -j] != symb) {
                break;
            } else {
                if (j == SIZE -1) {
                    return true;
                }
            }
        }
       return false;
    }
    // Ручная проверка выигрыша по всем вариантам для размера 3 на 3
/*    if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
    if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
    if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
    if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
    if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
    if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
    if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
    if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
    return false;*/

    // Проверка не заполнено ли поле польностью
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }
    // ход компьютера. P.S. код (для размера 3) подсмотрел в интернете, но самостоятельно дописал до произвольного размера и разобрался в нем :)
    public static void aiTurn(char turn) {

        if (check1Diagonal()) return;

        if (check2Diagonal()) return;

        if (checkRows()) return;

        if (checkColumns()) return;
        // Если нет угроз и предвыигрышных ситуаций ходим произвольно
        randomWalk(turn);
    }

    // получение числа из консольного ввода
    public static int getNumber() {
        int trying;
        String buffer;

        while (true) {
            if (sc.hasNextInt()) {
                trying = sc.nextInt();
                break;
            } else {
                buffer = sc.next();
                System.out.println("Введены неверные символы: " + buffer);
            }
        }

        return trying;
    }
    // Ход человека
    public static void humanTurn(char turn) {
        int x, y;
        do {
            System.out.println("(Ваша фишка " + turn + " ) Введите координаты в формате X(по горизонтали) Y (по вертикали)");
            x = getNumber() - 1;
            y = getNumber() - 1;
        } while (isCellValid(x, y));
        map[y][x] = turn;
    }
    // Проверка валидности введенных координат
    public static boolean isCellValid(int x, int y) {
        if (x <0 || x >= SIZE || y < 0 || y >= SIZE) {
            return true;
        }
        return map[y][x] != DOT_EMPTY;
    }
    // Инициализация игрового поля
    public static void  initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //Вывод игрового поля в консоль
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // выбор варианта случаен
    public static void randomWalk( char turn) {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);

        } while (isCellValid(x, y));
        System.out.println("Компьютер c фишкой " + turn + " походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = turn;

    }

    // близко проигрышная ситуация для программы
    public static boolean isLosingNear(char turn_NOW) {
        if (turn_NOW == DOT_O) {
            return ((free == 1 && countX == SIZE - 1) || (free == 1 && countY == SIZE - 1) || (free == 1 && countZ == SIZE - 1));
        } else if (turn_NOW == DOT_Y) {
            return ((free == 1 && countX == SIZE - 1) || (free == 1 && countO == SIZE - 1) || (free == 1 && countZ == SIZE - 1));
        } else if (turn_NOW == DOT_Z) {
            return ((free == 1 && countX == SIZE - 1) || (free == 1 && countO == SIZE - 1) || (free == 1 && countY == SIZE - 1));
        }
        return false;
    }

    // близко выигрыш
    public static boolean isWinNear(char turn_NOW) {
        if (turn_NOW == DOT_O) {
            return (free == 1 && countO == SIZE - 1);
        } else if (turn_NOW == DOT_Y) {
            return (free == 1 && countY == SIZE - 1);
        } else if (turn_NOW == DOT_Z) {
            return (free == 1 && countZ == SIZE - 1);
        }
        return false;
    }

    // постановка cооветствующего символа (0 или Y)
    public static boolean putSymb(int i, int j) {
        if (map[i][j] == DOT_EMPTY) {
            map[i][j] = turn_NOW;
            return true;
        }
        return false;
    }
    // Инициализация счетчиков
    public static void initCount() {
        countX = 0;
        countO = 0;
        countY = 0;
        countZ = 0;
        free  = 0;
    }

    // подсчет 'х', 'о' , 'y', 'z' и пустых клеток
    public static void count(int i, int j) {
        if (map[i][j] == DOT_X) {
            countX++;
        }
        if (map[i][j] == DOT_O) {
            countO++;
        }
        if (map[i][j] == DOT_Y) {
            countY++;
        }
        if (map[i][j] == DOT_Z) {
            countZ++;
        }
        if (map[i][j] == DOT_EMPTY) {
            free++;
        }
    }
    // контроль первой диагонали
    public static boolean check1Diagonal() {
        initCount();
        for (int i = 0; i < SIZE; i++) {
            count(i, i);
        }

        if (isWinNear(turn_NOW) || isLosingNear(turn_NOW)) {
            for (int i = 0; i < SIZE; i++) {
                if (putSymb(i, i)) return true;
            }
        }

        return false;
    }
    // контроль второй диагонали
    public static boolean check2Diagonal() {
        initCount();
        int j = SIZE -1;
        for (int i = 0; i < SIZE; i++) {
            count(i, j);
            j--;
        }

        if (isWinNear(turn_NOW) || isLosingNear(turn_NOW)) {
            j = SIZE -1;
            for (int i = 0; i < SIZE; i++) {
                if (putSymb(i, j)) return true;
                j--;
            }
        }

        return false;
    }
    // контроль строк
    public static boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            initCount();
            for (int j = 0; j < SIZE; j++) {
                count(i, j);
            }

            if (isWinNear(turn_NOW) || isLosingNear(turn_NOW)) {
                for (int j = 0; j < SIZE; j++) {
                    if (putSymb(i,j)) return true;
                }
            }

        }

        return false;
    }
    // контроль столбцов
    public static boolean checkColumns() {
        for (int j = 0; j < SIZE; j++) {
            initCount();
            for (int i = 0; i < SIZE; i++) {
                count(i, j);
            }

            if (isWinNear(turn_NOW) || isLosingNear(turn_NOW)) {
                for (int i = 0; i < SIZE; i++) {
                    if (putSymb(i,j)) return true;
                }
            }

        }

        return false;
    }
}

