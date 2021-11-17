package core.android.course.lesson.eight;

import java.util.Random;

public class RunningTrack implements Obstacle{
    private int length;

    public RunningTrack() {
        Random random = new Random();
        this.length = random.nextInt(7) + 3;
    }

    public int getLength() {
        return length;
    }
}
