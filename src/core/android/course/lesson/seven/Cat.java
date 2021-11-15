package core.android.course.lesson.seven;

import java.util.Random;

public class Cat {

    private String name;
    private int appetit;
    private int satiety;

    public Cat(String name) {
        Random random = new Random();
        this.name = name;
        this.appetit = random.nextInt(150) + 50;
        this.satiety = 0;
    }

    public void eat(Bowl bowl) {
        System.out.printf("Where is %d food in the bowl\n", bowl.getFood());
        if (bowl.eat(this.appetit) > 0) {
            System.out.printf("The cat %s has eat %d food\n", this.name, this.appetit);
            return;
        }

        System.out.printf("The cat %s has stayed hungry\n", this.name);

        return;
    }
}
