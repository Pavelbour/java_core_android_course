package core.android.course.lesson.two;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        switchZerosOnes();
        fillArr();
        multiplArr();
        diagonalArr();
        minMaxArr();
        minMaxArr();
        System.out.println("balance methode");
        int[] arr = {2, 2, 3, 1};
        if (balance(arr)) {
            System.out.println("Array " + Arrays.toString(arr) + " have a balance point.");
        } else {
            System.out.println("Array " + Arrays.toString(arr) + " don't have a balance point.");
        }
        System.out.println("======================");
        shift(arr, 1);
    }

    public static void switchZerosOnes() {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 1, 0};
        System.out.println("switchZerosOnes methode");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    public static void fillArr() {
        int[] arr;
        arr = new int[8];
        System.out.println("fillArr method");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    public static void multiplArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("multipArr method");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    public static void diagonalArr() {
        System.out.println("diagonalArr method");
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr[i].length-i-1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    public static void minMaxArr() {
        System.out.println("minMaxArr method");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }

    public static boolean balance(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i + 1; j++) {
                sumLeft += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                sumRight += arr[k];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    public static void shift(int[] arr, int n) {
        System.out.println("shift method");
        int start;
        int direction;
        int limit;
        if (n > 0) {
            start = 0;
            direction = 1;
            limit = arr.length;
        } else {
            start = arr.length - 1;
            direction = -1;
            limit = -1;
        }
        for (int k = 0; k < abs(n); k++) {
                int buffer = arr[limit - direction];
                int bufferNext;
                for (int i = start; i != limit; i += direction) {
                    bufferNext = arr[i];
                    arr[i] = buffer;
                    buffer = bufferNext;
                }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("======================");
        System.out.println();
    }
}
