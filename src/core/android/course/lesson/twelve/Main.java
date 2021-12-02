package core.android.course.lesson.twelve;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];


    public static void main(String[] args) {
        System.out.println("Single thread");
        long a = System.currentTimeMillis();
        singleThread();
        System.out.println(System.currentTimeMillis() - a);

        System.out.println("Multi thread");
        a = System.currentTimeMillis();
        multiThread();
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void singleThread() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void multiThread() {
        for (int i = 0; i < h; i++) {
            a1[i] = 1;
        }
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, 0, h);
    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < h; i++) {
                a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < h; i++) {
                a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
}
