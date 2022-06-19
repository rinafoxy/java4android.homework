package homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {

    static Scanner in = new Scanner(System.in);

    public static final int FAKE_WORD_LENGTH = 15;
    public static final String[] WORDS = new String[]{
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        System.out.println("Угадай слово, которое я загадал");
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        String computerWord = WORDS[index];
        String userWord = null;

        do {
            System.out.print("Введи слово: ");
            userWord = in.nextLine();

            if (isWin(computerWord, userWord)) {
                System.out.println("Все верно!");
                break;
            }

            System.out.println("Не верно! Ниже подсказка.");
            printPrompt(computerWord, userWord);
            System.out.println();

        } while (true);

        System.out.println("Игра окончена!");
    }

    private static boolean isWin(String computerWord, String userWord) {
        return computerWord.equals(userWord);
    }

    private static void printPrompt(String computerWord, String userWord) {
        for (int i = 0; i < FAKE_WORD_LENGTH; i++) {
            char chr = '#';
            if ( i < userWord.length() && i < computerWord.length() && userWord.charAt(i) == computerWord.charAt(i) ) {
                chr = userWord.charAt(i);
            }
            System.out.print(chr);
        }
    }
}
