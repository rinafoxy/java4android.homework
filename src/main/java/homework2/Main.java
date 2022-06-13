package homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //exercise 1
        int[] arr1 = {0, 0, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println("exercise 1: " + Arrays.toString(arr1) + "\n");

        //exercise 2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println("exercise 2: " + Arrays.toString(arr2) + "\n");

        //exercise 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("exercise 3: " + Arrays.toString(arr3) + "\n");

        //exercise 4
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = arr4[i][arr4.length - i - 1] = 1;
        }
        System.out.println("exercise 4:");
        for (int[] x : arr4) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        //exercise 5
        int[] arr5 = {1, 5, -4, 3, 15, 104, 23};
        int minElement = arr5[0];
        int maxElement = arr5[arr5.length - 1];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < minElement) {
                minElement = arr5[i];
            }
            if (arr5[i] > maxElement) {
                maxElement = arr5[i];
            }
        }
        System.out.println("exercise 5:\nmin element of array: " + minElement + "\nmax element of array: " + maxElement + "\n");

        //exercise 6
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("exercise 6: " + checkBalanceArray(arr6) + "\n");

        //exercise 7
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println("exercise 7:");
        shiftArray(arr7, -2);
    }

    public static boolean checkBalanceArray(int[] arr) {
        boolean balanceArray = false;
        int sumArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArray += arr[i];
        }
        int leftSumArray = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSumArray += arr[i];
            if (leftSumArray == sumArray - leftSumArray) {
                balanceArray = true;
            }
        }
        return balanceArray;
    }

    public static void shiftArray(int[] arr, int shift) {
        System.out.println("original array: " + Arrays.toString(arr));
        if (shift == 0) {
            System.out.println("for shift = " + shift + " array will not be shifted");
        }
        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int buffer = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = buffer;
            }
        } else {
            for (int i = 0; i < Math.abs(shift); i++) {
                int buffer = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = buffer;
            }
        }
        System.out.println("array after shift by " + shift + " elements: " + Arrays.toString(arr));
    }
}
