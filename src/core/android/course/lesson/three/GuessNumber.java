package core.android.course.lesson.three;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        gameLoop();
    }

    public static void gameLoop() {
        boolean end = false;
        int loop = 5;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            int number = rand.nextInt(10);

            for (int i = 0; i < 3; i++) {
                System.out.println("Guesse the number:");
                int guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("The number is bigger. Try again.");
                } else if (guess > number) {
                    System.out.println("The number is smaller. Try again");
                } else {
                    System.out.println("Bravo! You guessed.");
                    break;
                }
            }

            while (loop != 1 && loop != 0) {
                System.out.println("One more time? 1 = Yes 0 = No");
                loop = scanner.nextInt();
                if (loop != 1 && loop != 0) {
                    System.out.println("The response is incorrect. Entre 1 or 0");
                }
                if (loop == 0) {
                    end = true;
                }
            }
        }
    }
}
