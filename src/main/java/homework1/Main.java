package homework1;

public class Main {
    public static void main(String[] args) {

        //exercise2
        byte var1 = 127;
        short var2 = 10349;
        int var3 = -405934;
        long var4 = 100043492L;
        float var5 = 142.52f;
        double var6 = 32494.1;

        char var7 = '$';
        char var8 = 1300;

        boolean isSomething = true;
        boolean isSomewhere = false;

        String strExample = "THIS IS FINE";

        //exercise3
        System.out.println(calculateExpression(54.32f, 435.03f, -82.435f, 0.5f));
        System.out.println(calculateExpression(54.32f, 435.03f, -82.435f, 0f));

        //exercise4
        System.out.println(checkSum(5, 9));
        System.out.println(checkSum(-100, 20));

        //exercise5
        isPositiveOrNegative(5);
        isPositiveOrNegative(-9);

        //exercise6
        System.out.println(checkNumber(-59));
        System.out.println(checkNumber(345));

        //exercise7
        meeting("Игорь");

        //exercise8
        determineYear(1000);
    }

    public static float calculateExpression(float a, float b, float c, float d) {
        if (d == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        return a * (b + (c / d));
    }

    public static boolean checkSum(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.printf("%d - положительное число\n", x);
        } else {
            System.out.printf("%d - отрицательное число\n", x);
        }
    }

    public static boolean checkNumber(int x) {
        return x < 0;
    }

    public static void meeting(String name) {
        System.out.printf("Привет, %s!\n", name);
    }

    public static void determineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - невисокосный");
        }
    }
}