package core.android.course.lesson.thirteen;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private CountDownLatch cdlStart;
    private CountDownLatch cdlFinish;
    private Semaphore tunnelSemaphore;
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CountDownLatch cdlStart, CountDownLatch cdlFinish, Semaphore tunnelSemaphore) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cdlStart = cdlStart;
        this.cdlFinish = cdlFinish;
        this.tunnelSemaphore = tunnelSemaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            this.cdlStart.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cdlStart.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            if (race.getStages().get(i) instanceof Tunnel) {
                try {
                    this.tunnelSemaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            race.getStages().get(i).go(this);
            if (race.getStages().get(i) instanceof Tunnel) {
                    this.tunnelSemaphore.release();
            }
        }
        cdlFinish.countDown();
    }
}
