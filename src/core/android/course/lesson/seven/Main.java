package core.android.course.lesson.seven;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bowl bowl = new Bowl();
        String[] names = {"Barsik", "Murzik", "Vasika", "Mashka", "Musika"};
        Cat[] cats = new Cat[6];
        Random random = new Random();

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(names[random.nextInt(names.length)]);
        }

        for (Cat cat: cats
             ) {
            cat.eat(bowl);
        }

        System.out.printf("%d food left in the bowl", bowl.getFood());
    }
}
