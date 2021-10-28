package core.android.course.lesson.three;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        gameLoop();
    }

    public static void gameLoop() {
        String[] words = {
                "apple",
                "orange",
                "lemon",
                "banana",
                "apricot",
                "avocado",
                "broccoli",
                "carrot",
                "cherry",
                "garlic",
                "grape",
                "melon",
                "leak",
                "kiwi",
                "mango",
                "mushroom",
                "nut",
                "olive",
                "pea",
                "peanut",
                "pear",
                "pepper",
                "pineapple",
                "pumpkin",
                "potato"
        };

        Random rand = new Random();
        int index = rand.nextInt(25);
        Scanner scanner = new Scanner(System.in);
        boolean guess = false;
        String userGuess;

        System.out.println("Guess the word:");

        while (!guess) {
            String pattern = "";
            int n=0;
            userGuess = scanner.next();
            int limit = Math.min(words[index].length(), userGuess.length());

            for (int i = 0; i < limit; i++) {
                if (userGuess.charAt(i) == words[index].charAt(i)) {
                    pattern += userGuess.charAt(i);
                    n++;
                } else {
                    pattern += "#";
                }
            }

            for (int j = words[index].length(); j < 16; j++) {
                pattern += "#";
            }

            if (n == words[index].length()) {
                System.out.println("Bravo! You guessed");
                guess = true;
            } else {
                System.out.println(pattern);
                System.out.println("Try again");
            }
        }
    }
}
