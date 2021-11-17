package core.android.course.lesson.eight;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[5];
        Participant[] participants = new Participant[5];
        Random random = new Random();

        for (int i = 0; i < obstacles.length; i++) {
            if (random.nextInt(2) < 1) {
                obstacles[i] = new RunningTrack();
            } else {
                obstacles[i] = new Wall();
            }
        }

        for (int i = 0; i < participants.length; i++) {
            switch (random.nextInt(3)) {
                case 0: participants[i] = new Human();
                        break;
                case 1: participants[i] = new Cat();
                        break;
                case 2: participants[i] = new Robot();
            }
        }

        for (Obstacle obstacle: obstacles) {
            for (Participant participant: participants) {
                if (!participant.isFinished()) {
                    if (obstacle instanceof Wall) {
                        participant.jump((Wall) obstacle);
                    } else if (obstacle instanceof RunningTrack) {
                        participant.run((RunningTrack) obstacle);
                    }
                }
            }
        }
    }
}
