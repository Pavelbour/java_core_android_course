package core.android.course.lesson.seven;

import java.util.Random;

public class Bowl {
    private int food;

    public Bowl() {
        Random random = new Random();
        this.food = random.nextInt(350) + 250;
        System.out.printf("A bowl with %d food is served.\n", this.food);
    }

    public int eat(int quantity) {
        if (quantity <= this.food) {
            this.food -= quantity;
            return quantity;
        }

        return 0;
    }

    public int getFood() {
        return this.food;
    }
}
