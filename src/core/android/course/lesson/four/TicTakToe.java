package core.android.course.lesson.four;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {

    private static char[][] field;
    private static char FIELD_VOID = '*';
    private static char human_char = 'X';
    private static char ai_char = 'O';
    private static int field_size_x = 3;
    private static int field_size_y = 3;
    private static int win_size = 3;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initGame();
        int i = 1;
        while (true) {
            System.out.println("ROUND #" + i);
            i++;
            if (humanGo()) {
                System.out.println("You win!");
                break;
            }
            if (AIGo()) {
                System.out.println("You loose!");
                break;
            }
            printField();
        }
    }

    public static void initGame() {
        System.out.println("Input the field size X:");
        int x = scanner.nextInt();
        System.out.println("input the field size Y:");
        int y = scanner.nextInt();
        initField(x,y);

        System.out.println("Input win combination size.");
        win_size = scanner.nextInt();

        System.out.println("Input a symbol for human");
        human_char = scanner.next().charAt(0);

        System.out.println("Input a symbol for AI");
        ai_char = scanner.next().charAt(0);
    }

    public static void initField(int x, int y) {
        field_size_x = x;
        field_size_y = y;
        field = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                field[i][j] = FIELD_VOID;
            }

        }
    }

    public static boolean humanGo() {
        boolean check_turn = false;
        while (!check_turn) {
            System.out.println("Your turn");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (field[x][y] == FIELD_VOID) {
                field[x][y] = human_char;
                check_turn = true;
            }
        }
//        printField();
        return checkWin(human_char);
    }

    public static boolean AIGo() {
        for (int i = win_size - 1; i > 0 ; i--) {
            for (int j = 0; j < field_size_x; j++) {
                for (int k = 0; k < field_size_y; k++) {
                    if (checkRow(j, k, 1, -1, i, human_char)) {
                        if (makeTurn(j+i, k-i, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j-1, k +1, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 1, 0, i, human_char)) {
                        if (makeTurn(j+i, k, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j-1, k, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 1, 1, i, human_char)) {
                        if (makeTurn(j+i, k+i, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j-1, k-1, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 0, 1, i, human_char)) {
                        if (makeTurn(j, k+i, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j, k-1, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 1, -1, i, ai_char)) {
                        if (makeTurn(j+i, k-i, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j-1, k +1, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 1, 0, i, ai_char)) {
                        if (makeTurn(j+i, k, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j-1, k, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 1, 1, i, ai_char)) {
                        if (makeTurn(j+i, k+i, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j-1, k-1, ai_char)) return checkWin(ai_char);
                    }
                    else if (checkRow(j, k, 0, 1, i, ai_char)) {
                        if (makeTurn(j, k+i, ai_char)) return checkWin(ai_char);
                        if (makeTurn(j, k-1, ai_char)) return checkWin(ai_char);
                    }
                }
            }
        }

        boolean check_turn = false;
        do {
            int pointX = random.nextInt(field_size_x);
            int pointY = random.nextInt(field_size_y);
            check_turn = makeTurn(pointX, pointY, ai_char);
        } while (!check_turn);
        return checkWin(ai_char);
    }

    public static boolean makeTurn(int x, int y, char turn) {
        if (x < 0 || x >= field_size_x) return false;
        if (y < 0 || y >= field_size_y) return false;

        if (field[x][y] == FIELD_VOID) {
            field[x][y] = turn;
            return true;
        }

        return false;
    }

    public static boolean checkWin(char check) {
        for (int i = 0; i < field_size_x; i++) {
            for (int j = 0; j < field_size_y; j++) {
                if (checkRow(i, j, 1, -1, win_size, check)) return true;
                if (checkRow(i, j, 1, 0, win_size, check)) return true;
                if (checkRow(i, j, 1, 1, win_size, check)) return true;
                if (checkRow(i, j, 0, 1, win_size, check)) return true;
            }
        }
        return false;
    }

    public static boolean checkRow(int startX, int startY, int x, int y, int z, char check) {
        int posX = startX;
        int posY = startY;

        for (int i = 0; i < z; i++) {
            if (posX < 0 || posX >= field_size_x) return false;
            if (posY < 0 || posY >= field_size_y) return false;
            if (field[posX][posY] != check) return false;
            posX += x;
            posY += y;
        }

        return true;
    }

    public static void printField() {
        for (int i = 0; i < field_size_x; i++) {
            for (int j = 0; j < field_size_y; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
