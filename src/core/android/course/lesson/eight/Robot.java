package core.android.course.lesson.eight;

import java.util.Random;

public class Robot implements Participant{
    private int jumpHeight;
    private int runLength;
    private boolean finished;
    private String name;
    private static final String[] NAMES = {"R2D2", "TR3", "ODR14", "NRD-A"};

    public Robot() {
        this.finished = false;
        Random random = new Random();
        this.name = NAMES[random.nextInt(this.NAMES.length)];
        this.jumpHeight = random.nextInt(7) + 3;
        this.runLength = random.nextInt(7) + 3;
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= this.jumpHeight) {
            System.out.printf("The robot %s has jump over the wall\n", this.name);
            return;
        }

        System.out.printf("The robot %s has been eliminated\n", this.name);
        this.finished = true;
    }

    @Override
    public void run(RunningTrack track) {
        if (track.getLength() <= this.runLength) {
            System.out.printf("The robot %s has runned the track\n", this.name);
            return;
        }

        System.out.printf("The robot %s has been eliminated\n", this.name);
        this.finished = true;
    }

    public boolean isFinished() {
        return finished;
    }
}
