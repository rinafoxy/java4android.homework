package homework3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            turnGameGuessNumber();
            System.out.println("Хотите сыграть ещё раз? Напишите 'нет' для выхода");
            String userAnswer = in.next();
            if (userAnswer.equals("нет")) {
                break;
            }
        }
        System.out.print("Хорошего дня!");
        in.close();
    }

    public static void turnGameGuessNumber() {
        int counterAttempt = 3;
        int computerNumber = SetNumber();
        int userNumber = getUserNumber();
        checkNumber(computerNumber, userNumber, counterAttempt);
    }

    private static int SetNumber() {
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }

    private static int getUserNumber() {
        System.out.println("Введите число от 0 до 9");
        int number = 0;
        boolean isValid;
        do {
            isValid = false;
            if (in.hasNextInt()) {
                number = in.nextInt();
                isValid = true;
            } else {
                System.out.println("Введите целое число");
                in.next();
            }
        } while (!isValid);
        return number;
    }

    private static void checkNumber(int computerNumber, int userNumber, int counterAttempt) {
        int userAttempt;
        for (userAttempt = 1; userAttempt <= counterAttempt; userAttempt++) {
            if (userNumber == computerNumber) {
                System.out.printf("Вы выиграли! Загаданное число: %d%n", computerNumber);
                break;
            } else if (userNumber < computerNumber) {
                System.out.printf("Загаданное число больше. Осталось попыток: %d%n", (counterAttempt - userAttempt));
            } else if (userNumber > computerNumber) {
                System.out.printf("Загаданное число меньше. Осталось попыток: %d%n", (counterAttempt - userAttempt));
            }
            if (userAttempt == counterAttempt) {
                System.out.printf("Вы проиграли. Загаданное число: %d%n", computerNumber);
                break;
            }
            userNumber = getUserNumber();
        }
    }
}
