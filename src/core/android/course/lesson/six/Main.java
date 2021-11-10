package core.android.course.lesson.six;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] catNames = {"Barsik", "Murzik", "Vaska"};
        String[] dogNames = {"Tuzik", "Bobik", "Sharik"};
        Random random = new Random();
        Cat cats[] = new Cat[5];
        Dog dogs[] = new Dog[5];

        for (int i = 0; i < cats.length; i++) {
            int nameIndex = random.nextInt(catNames.length);
            cats[i] = new Cat(catNames[nameIndex]);
        }

        for (Cat cat:
             cats) {

            cat.run(random.nextInt(250));
            cat.swim(random.nextInt(2));
        }

        for (int i = 0; i < dogs.length; i++) {
            int nameIndex = random.nextInt(dogNames.length);
            dogs[i] = new Dog(dogNames[nameIndex]);
        }

        for (Dog dog:
                dogs) {

            dog.run(random.nextInt(600));
            dog.swim(random.nextInt(12));
        }

        System.out.printf("Total animals: %d\n", Animal.getCount());
        System.out.printf("Total cats: %d\n", Cat.getCount());
        System.out.printf("Total dogs: %d\n", Dog.getCount());
    }
}
