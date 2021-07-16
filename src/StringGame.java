import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class StringGame {

    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

        String compChoice = computerChoice();

        while (true) {
            String humanChoice = humanAnswer();
            if(checkWin(compChoice, humanChoice)){
                break;
            }


        }
    }

    public static String computerChoice() {
        String compChoice;
        int randomDigit = (int) (Math.random() * 25);
        return words[randomDigit];
    }

    public static String humanAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал фрукт или овощ на английском, попытайтесь его угадать:");
        String humanAnswer = scanner.nextLine();
        humanAnswer = humanAnswer.toLowerCase();
        return humanAnswer;
    }

    public static boolean checkWin(String compChoice, String humanChoice) {

        if (compChoice.equals(humanChoice)) {
            System.out.println("Победа! Вы угадали!!!");
            return true;

        } else {

            int min = Math.min(compChoice.length(), humanChoice.length());

            for (int i = 0; i < min; i++) {

                if (compChoice.charAt(i) == humanChoice.charAt(i)) {
                    System.out.print(compChoice.charAt(i));
                } else {
                    System.out.print("#");
                }
            }
            for (int i =0; i<15-compChoice.length(); i++){
                System.out.print("#");
            }
            System.out.println();
            return false;
        }


        }
    }





