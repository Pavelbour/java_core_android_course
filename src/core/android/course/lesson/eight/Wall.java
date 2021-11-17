package core.android.course.lesson.eight;

import java.util.Random;

public class Wall implements Obstacle{
    private int height;

    public Wall() {
        Random random = new Random();
        this.height = random.nextInt(7) + 3;
    }

    public int getHeight() {
        return height;
    }
}
